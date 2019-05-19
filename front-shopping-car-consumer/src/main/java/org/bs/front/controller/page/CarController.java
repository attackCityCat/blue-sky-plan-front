package org.bs.front.controller.page;

import com.netflix.client.http.HttpResponse;
import org.bs.front.pojo.product.ProductBean;
import org.bs.front.service.ShopCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("page")
public class CarController {

    @Autowired
    private ShopCarService shopCarService;

    //进入购物车
    @RequestMapping(value = "test")
    private String queryShopCar(Model model, HttpSession session, HttpServletResponse response) throws IOException {

        //暂时的关闭此功能 等上线时开通
       /* UserBean user = (UserBean)session.getAttribute(session.getId());
        user.setUserId(1);
        //System.out.println("我是session"+user);
        //判断是否登陆 未登录就将请求转发到登陆   页否则就继续
       if(user==null){
            response.sendRedirect("http://localhost:8099/user/page/toLogin");
            return null;
        }*/
        //根据用户的key取redis中查询对应的值
        String key = ConstantClass.FIND_USER_SHOP_CAR+"userId";

        System.out.println("看一下这个Key有没有值-------》"+key);
        //上数据库查询这个用户的商品
        List<ProductBean> list = shopCarService.queryShopCar(key);


        model.addAttribute("count",list.size());

        model.addAttribute("list", list);
        return "view/show";
    }

    /**
     * 这里删除时需要2个参数 也就是两个Key
     * 第一个为用户购物车的Key
     * 第二个为商品的key  m目前为测试状态
     * String UserKey =  ConstantClass.FIND_USER_SHOP_CAR+"userId"; 这个里的userId是要在session中获取的
     * @param id    此ID为商品id
     * @return
     */
    @RequestMapping("delShopCar")
    @ResponseBody
    public boolean delShopCar(Integer id){
        try {
            String UserKey =  ConstantClass.FIND_USER_SHOP_CAR+"userId";
            String ShopKey = ConstantClass.SHOP_KEY+id;
           boolean bol = shopCarService.delShopCar(UserKey,ShopKey);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @RequestMapping("addShopCar")
    public void addShopCar(){
        shopCarService.addShopCar();
    }

    /**
     * 修改商品数量  商品数量+
     * @param id
     */
    @RequestMapping("pulsCount")
    @ResponseBody
    public void pulsCount(String id){
        String UserKey =  ConstantClass.FIND_USER_SHOP_CAR+"userId";
        String ShopKey = ConstantClass.SHOP_KEY+id;
        shopCarService.pulsCount(UserKey,ShopKey);
    }
    /**
     * 修改商品数量  商品数量-
     * @param id
     */
    @RequestMapping("reduceCount")
    @ResponseBody
    public void reduceCount(String id){
        String UserKey =  ConstantClass.FIND_USER_SHOP_CAR+"userId";
        String ShopKey = ConstantClass.SHOP_KEY+id;
        shopCarService.reduceCount(UserKey,ShopKey);
    }


}
