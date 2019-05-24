package org.bs.front.service;

import org.bs.front.pojo.city.CityBean;
import org.bs.front.pojo.order.OrderBean;
import org.bs.front.pojo.product.ProductBean;
import org.bs.front.pojo.shop.ShopBean;
import org.bs.front.pojo.user.UserBean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Lenovo
 * @title: OrderServiceApi
 * @projectName blue-sky-plan-front
 * @description: TODO
 * @date 2019/5/1716:35
 */
public interface OrderServiceApi {

    @RequestMapping(value = "queryOrder")
    List<OrderBean> queryOrder();

    @RequestMapping(value = "cashier")
    List<ProductBean> queryShopCar(@RequestParam(value = "userKey") String userKey, @RequestParam(value = "ids") int[] ids);

    //查询用户
    @RequestMapping(value = "/queryUserById")
    UserBean queryUserById(@RequestParam(value = "userId") Integer userId);

    //查询城市
    @RequestMapping(value = "/queryCity")
    CityBean queryCity(@RequestParam(value = "cityId") Integer cityId);

    //查询商品
    @RequestMapping(value = "/queryShopById")
    ShopBean queryShopById(@RequestParam(value = "shopId") Integer shopId);
}
