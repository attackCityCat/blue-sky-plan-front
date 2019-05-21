package org.bs.front.controller;

import org.bs.front.constant.ConstantClass;
import org.bs.front.pojo.showproduct.ProductBean;
import org.bs.front.pojo.user.UserBean;
import org.bs.front.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("page")
public class PageController {
    @Autowired
    private UserService userService;


    @Resource
    RedisTemplate<String,Object> redisTemplate;


    /**
     * 进入主页并 查询商品列表
     * @param model
     * @return
     */
    @RequestMapping("toMain")
    public String toIndex(Model model) {

        List<ProductBean> list = userService.findShopList();
       System.out.println("////////////////////////"+list);
        model.addAttribute("list",list);
        // 开会内容 商品下架时 从购物车删除  商品涨价或者降价时 购物车的价钱也要跟着加减
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

        //当进入到这个方法的时候说明用户登陆成功 直接查一下用户的购物车并返回页面
        long hashLength = redisTemplate.opsForHash().size(ConstantClass.FIND_USER_SHOP_CAR + user.getUserId());
        System.out.println("此用户购物车的商品有---》"+hashLength);
        model.addAttribute("count",hashLength);
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
