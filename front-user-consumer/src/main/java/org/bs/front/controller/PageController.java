package org.bs.front.controller;

import org.bs.front.constant.ConstantClass;
import org.bs.front.pojo.user.UserBean;
import org.bs.front.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("page")
public class PageController {

    @Autowired
    UserService userService;

    @GetMapping("toMain")
    public String toIndex() {
        return "jsp/main";
    }

    @GetMapping("toLogin")
    public String toLogin() {
        return "jsp/login";
    }

    @GetMapping("/toEnroll")
    public String toEnroll() {
        return "jsp/enroll";
    }

    /**
     * 当用户登录成功就要去查购物车 展示出来购物车的商品数量
     *
     * @param model
     * @param session
     * @return
     */
    @RequestMapping("/toUser")
    public String toUser(Model model, HttpSession session) {
        UserBean user = (UserBean) session.getAttribute(session.getId());

        String key = ConstantClass.FIND_USER_SHOP_CAR + user.getUserId();

        System.out.println(key);
      //  Integer count = userService.queryShopCarCount(key);
      //  System.out.println(count);

      //  model.addAttribute("count",count);

        model.addAttribute("user", user);
        return "jsp/free";
    }

    @GetMapping("/toUserCenter")
    public String toUserCenter(Model model, HttpSession session) {
        UserBean user = (UserBean) session.getAttribute(session.getId());
        model.addAttribute("user", user);
        return "jsp/userCenter";
    }

    @GetMapping("/toRetrieve")
    public String toRetrieve() {
        return "jsp/retrieve";
    }

    @GetMapping("/toFreeCenter")
    public String toFreeCenter(Model model, HttpSession session) {
        UserBean user = (UserBean) session.getAttribute(session.getId());
        model.addAttribute("user", user);
        return "center/freeCenter";
    }
}
