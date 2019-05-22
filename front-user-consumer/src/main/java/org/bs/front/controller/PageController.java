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
     *
     * @param model
     * @returnfindShopList
     */
    @RequestMapping("toMain")
    public String toIndex(Model model) {

        //查询女装
        List<ProductBean> list = userService.findShopList();
        //查询男装
        List<ProductBean> listMen = userService.findShopListMen();
        System.out.println("查询到的女装信息为----》" + list);
        System.out.println("查询到的男装信息为----》" + listMen);
        //返回女装数据
        model.addAttribute("list", list);
        //返回男装数据
        model.addAttribute("listMan", listMen);

        return "jsp/free";
    }

       @GetMapping("toLogin")
       public   String  toLogin(){
            return   "jsp/login";
       }

       @GetMapping("/toEnroll")
       public   String   toEnroll(){
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
        Integer count = 0;
        UserBean user = (UserBean) session.getAttribute(session.getId());
        if (user != null) {
            String key = ConstantClass.FIND_USER_SHOP_CAR + user.getUserId();
            System.out.println(key);
            count = userService.queryShopCarCount(key);
        }
        model.addAttribute("count",count);

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


    /**
     * 查询商品详情以及商品图片
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/queryShopDetails")
    public String queryShopDetails(Integer id,Model model){
        //查询商品的详情
        ProductBean pro =  userService.queryShopDetails(id);

        //在详情页面展示4条销量最高的数据
        List<ProductBean> list = userService.topSelling();


        List<String> shopImg =  userService.queryShopImg(id);
        System.out.println(pro);
        System.out.println(shopImg);
        System.out.println(list);
        model.addAttribute("list",list);
        model.addAttribute("img",shopImg);
        model.addAttribute("pro",pro);
        return "jsp/product";
    }
}
