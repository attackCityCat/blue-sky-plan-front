package org.bs.front.controller.page;

import org.bs.front.pojo.product.ProductBean;
import org.bs.front.service.ShopCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("page")
public class CarController {

    @Autowired
    private ShopCarService shopCarService;

    //进入购物车
    @RequestMapping(value = "test")
    private String queryShopCar(Model model){
        List<ProductBean> list = shopCarService.queryShopCar();
        System.out.println(list);
        model.addAttribute("list",list);
        return "view/show";
    }
}
