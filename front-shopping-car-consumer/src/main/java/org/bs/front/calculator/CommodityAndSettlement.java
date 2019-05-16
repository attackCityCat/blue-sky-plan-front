package org.bs.front.calculator;

import org.bs.front.service.ShopCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("calc")
public class CommodityAndSettlement {

    @Autowired
    private ShopCarService shopCarService;

    /**
     * 此方法计算就是修改购物车商品数量
     * 数量+1
     */
    @RequestMapping("updateCountPuls")
    @ResponseBody
    public boolean updateCountPuls(Integer id) {

        try {
            System.out.println(id);
            System.out.println("修改数量+");
            shopCarService.updateCountPuls(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 此方法计算就是修改购物车商品数量
     * 数量-1
     */
    @RequestMapping("updateCountReduce")
    @ResponseBody
    public boolean updateCountReduce(Integer id) {
        try {
            System.out.println(id);
            shopCarService.updateCountReduce(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //删除购物车的商品
    @RequestMapping("delShopCar")
    @ResponseBody
    public boolean delShopCar(Integer id){

        try {
            shopCarService.delShopCar(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }
}
