package org.bs.front.controller.page;

import com.netflix.client.http.HttpResponse;
import org.bs.front.constant.ConstantClass;
import org.bs.front.pojo.product.ProductBean;
import org.bs.front.pojo.user.UserBean;
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

       /* UserBean user = (UserBean)session.getAttribute(session.getId());
        user.setUserId(1);*/
        //System.out.println("我是session"+user);
        //判断是否登陆 未登录就将请求转发到登陆   页否则就继续
     /*   if(user==null){
            response.sendRedirect("http://localhost:8099/user/page/toLogin");
            return null;
        }*/
        //根据用户的key取redis中查询对应的值
        String key = ConstantClass.FIND_USER_SHOP_CAR+"userId";

        System.out.println("看一下这个Key有没有值-------》"+key);
        //上数据库查询这个用户的商品
        List<ProductBean> list = shopCarService.queryShopCar(key);

        model.addAttribute("list", list);
        return "view/show";
    }


}
