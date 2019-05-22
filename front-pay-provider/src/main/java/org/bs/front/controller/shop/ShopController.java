package org.bs.front.controller.shop;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.bs.front.mapper.ShopMapper;
import org.bs.front.pojo.shop.ImgBean;
import org.bs.front.pojo.shop.ShopBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
 * @date 2019/5/2120:14
 */
@Controller
public class ShopController {

    @Autowired
    private ShopMapper shopMapper;

    @RequestMapping(value = "queryImg")
    @ResponseBody
    public List<ImgBean> queryImg(@RequestParam(value = "ids") String[] ids){
        List<ImgBean> list = shopMapper.queryImg(ids);
        return list;
    }

}
