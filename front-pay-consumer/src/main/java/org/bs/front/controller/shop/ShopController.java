package org.bs.front.controller.shop;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.bs.front.pojo.shop.ImgBean;
import org.bs.front.pojo.shop.ShopBean;
import org.bs.front.service.shop.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.*;

/**
 * @author Lenovo
 * @title: ShopController
 * @projectName blue-sky-plan-front
 * @description: TODO
 * @date 2019/5/2114:03
 */
@Controller
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    ShopService shopService;

    @Autowired
    private SolrClient client;

    //查询图片
    @RequestMapping(value = "queryImg")
    @ResponseBody
    public List<ImgBean> queryImg(@RequestParam(value = "id") Integer id,Model model){
        List<ImgBean> list = shopService.queryImg(id);
        model.addAttribute("img",list);
        System.out.println(list);
        return list;
    }

    //查询方法
    @RequestMapping(value = "/queryShopList")
    public String queryShopList(ShopBean shop,String queryShop, Model model) throws IOException, SolrServerException {
        //返回的参数map
        Map<String, Object> mSolr = new HashMap<String, Object>();
        //查询的耳集合
        List<ShopBean> shopList = new ArrayList<>();
        //查询参数的对象SolrQuery
        SolrQuery params = new SolrQuery();
        //判断关键词是否为空
        if (!"".equals(queryShop) && queryShop != null) {
            //不为空关键词为前台传递的参数
            params.set("q", queryShop);
        } else {
            //为空查询所有
            params.set("q", "*:*");
        }
        //默认查询的字段
        params.set("df", "product_title");
        //默认返回的字段
        params.set("fl", "id,product_title,product_price,product_stock,product_time,product_sales,product_comments," +
                "product_concern,brand_id,size_id,product_state,color_id,shelf_time,product_audit,product_selling,store_id");
        // 高亮字段
        params.addHighlightField("product_title");

        //高亮
        //打开开关
        params.setHighlight(true);
        //设置前缀
        params.setHighlightSimplePre("<span style='color:red'>");
        //设置后缀
        params.setHighlightSimplePost("</span>");
        //solr查询返回的对象QueryResponse
        QueryResponse queryResponse = client.query("core1", params);
        //查询返回的真正结果
        SolrDocumentList results = queryResponse.getResults();
        //查询总条数
        long numFound = results.getNumFound();
        //高亮显示的内容
        Map<String, Map<String, List<String>>> highlight = queryResponse.getHighlighting();
        //循环遍历结果把查询内容放到list集合中
        for (SolrDocument result : results) {
            ShopBean shopBean = new ShopBean();
            String highname = "";
            //获得高亮内容
            Map<String, List<String>> map = highlight.get(result.get("id"));
            //获得高亮内容的list
            List<String> list = map.get("product_title");
            //判断是否为空
            if (list == null) {
                //如果为空没有高亮
                highname = (String) result.get("product_title");
            } else {
                //不为空有高亮
                highname = list.get(0);
            }
            //依次把字段放到product对象中
            shopBean.setProduct_id((String) result.get("id"));
            shopBean.setProduct_title(highname);
            shopBean.setProduct_price((Double) result.get("product_price"));
            shopBean.setBrand_id((Integer) result.get("brand_id"));
            shopBean.setColor_id((Integer) result.get("color_id"));
            shopBean.setProduct_audit((Integer) result.get("product_audit"));
            shopBean.setProduct_comments((Integer) result.get("product_comments"));
            shopBean.setProduct_concern((Integer) result.get("product_concern"));
            shopBean.setProduct_sales((Integer) result.get("product_sales"));
            shopBean.setProduct_selling((Integer) result.get("product_selling"));
            shopBean.setProduct_state((Integer) result.get("product_state"));
            shopBean.setProduct_stock((Integer) result.get("product_stock"));
            shopBean.setProduct_time((Date) result.get("product_time"));
            shopBean.setShelf_time((Date) result.get("shelf_time"));
            shopBean.setSize_id((Integer) result.get("size_id"));
            shopBean.setStore_id((Integer) result.get("store_id"));
            shopBean.setType_id((Integer) result.get("type_id"));
            shopList.add(shopBean);
        }
        model.addAttribute("list",shopList);
        return "view/main2";
    }
}
