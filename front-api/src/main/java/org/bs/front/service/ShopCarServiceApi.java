package org.bs.front.service;

import org.bs.front.pojo.product.ProductBean;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public interface ShopCarServiceApi {
    @GetMapping(value = "queryShopCar")
    List<ProductBean> queryShopCar(@RequestParam(value = "key") String key);


}
