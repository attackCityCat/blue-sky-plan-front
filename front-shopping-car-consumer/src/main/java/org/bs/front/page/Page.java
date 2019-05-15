package org.bs.front.page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("page")
public class Page {

    @RequestMapping(value = "test")
    public String test(Model model) {
        String s = "this is freemarker";
        System.out.println(s);
        model.addAttribute("str", s);
        return "view/show";
    }

    @RequestMapping(value = "particulars")
    public String particulars() {
        //跳转到商品详情页面
        return "view/particulars";
    }

    //模拟添加到购物车
    @RequestMapping("addShopCar")
    @ResponseBody
    public String addCar(String a ) {
        if ("1".equals(a)){
            return "添加购物车成功";
        }
        return "请登陆后操作";
    }


}
