package org.bs.front.service;

import org.bs.front.pojo.product.ProductBean;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public interface ShopCarServiceApi {

    //查询指定用户的指定购物车商品  基本完善 不用在改动了
    @GetMapping(value = "queryShopCar")
    List<ProductBean> queryShopCar(@RequestParam(value = "key") String key);

    //删除指定用户的指定购物车商品  基本完善 不用在改动了
    @RequestMapping(value = "delShopCar")
    boolean delShopCar(@RequestParam(value = "userKey") String userKey,@RequestParam(value = "shopKey") String shopKey);

    //模拟新增  还要完善
    @RequestMapping("addShopCar")
    void addShopCar();
}
