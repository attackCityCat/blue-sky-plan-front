package org.bs.front.service;

import org.bs.front.pojo.product.ProductBean;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public interface ShopCarServiceApi {
    @GetMapping(value = "queryShopCar")
    List<ProductBean> queryShopCar();

    @RequestMapping(value = "updateCountPuls")
    void updateCountPuls(@RequestParam(value = "id") Integer id);

    @RequestMapping(value = "updateCountReduce")
    void updateCountReduce(@RequestParam(value = "id") Integer id);

    @RequestMapping(value = "delShopCar")
    void delShopCar(@RequestParam(value = "id") Integer id);
}
