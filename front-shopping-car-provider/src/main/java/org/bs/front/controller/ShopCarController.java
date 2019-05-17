package org.bs.front.controller;

import org.bs.front.mapper.ShopCarMapper;
import org.bs.front.pojo.product.ProductBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShopCarController {

    @Autowired
    ShopCarMapper shopCarMapper;

    /**
     * 查询购物车商品
     * @return
     */
    @GetMapping(value = "queryShopCar")
   public List<ProductBean> queryShopCar(){

        return shopCarMapper.queryShopCar();
    }

    @RequestMapping(value = "updateCountPuls")
    public void updateCountPuls(@RequestParam(value = "id") Integer id){
        shopCarMapper.updateCountPuls(id);
    }
    @RequestMapping(value = "updateCountReduce")
    public void updateCountReduce(@RequestParam(value = "id") Integer id){
        shopCarMapper.updateCountReduce(id);
    }
    @RequestMapping(value = "delShopCar")
    public void delShopCar(@RequestParam(value = "id") Integer id){
        shopCarMapper.delShopCar(id);
    }

}
