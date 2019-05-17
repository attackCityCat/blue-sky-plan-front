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

        Object sessionAttribute = session.getAttribute(session.getId());
        if(sessionAttribute==null){
            response.sendRedirect("http://localhost:8099/user/page/toLogin");
        }
        List<ProductBean> list = shopCarService.queryShopCar();
        System.out.println(list);
        model.addAttribute("list",list);
        return "view/show";
    }

    @RequestMapping(value = "test1")
    @ResponseBody
    private String test(String name){
        try {
            ;
            return shopCarService.test(name);
        } catch (Exception e) {
            e.printStackTrace();
            return "失败";
        }

    }
}
