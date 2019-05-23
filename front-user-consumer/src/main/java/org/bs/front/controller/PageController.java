package org.bs.front.controller;

import org.bs.front.constant.ConstantClass;
import org.bs.front.pojo.showproduct.ProductBean;
import org.bs.front.pojo.showproduct.TypeBean;
import org.bs.front.pojo.user.UserBean;
import org.bs.front.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("page")
public class PageController {
    @Autowired
    private UserService userService;


    @Resource
    RedisTemplate<String, Object> redisTemplate;

    /**
     * 根据商品颜色查询对应信息
     * @param productTitle      商品名
     * @param colorVal      商品颜色
     * @return
     */
    @RequestMapping("findShopByColor")
    @ResponseBody
    public ProductBean findShopByColor(ProductBean productBean){
        ProductBean pro = userService.findShopByColor(productBean);
        System.out.println(pro);
        return  pro;
    }


    /**
     * 用户新增商品到购物车
     * @param productBean
     * @param session
     * @return
     */
    @RequestMapping("addShopCar")
    public String addShopCar(org.bs.front.pojo.product.ProductBean productBean, HttpSession session) {
       // UserBean user = (UserBean) session.getAttribute(session.getId());
      //  Integer userId = user.getUserId();

        //目前先这样写 上线时 写成 ueserId
        String userKey = ConstantClass.FIND_USER_SHOP_CAR;
        //商品key为商品key+商品id
        String shopKey = ConstantClass.SHOP_KEY + productBean.getProductId();

        System.out.println(productBean);

        //将用户加入购物车的商品存进redis缓存起来
        redisTemplate.opsForHash().put(userKey, shopKey, productBean);

        //完成以后重定向到首页
        return "redirect:toMain";
    }


    /**
     * 进入主页并 查询商品列表
     *
     * @param model
     * @returnfindShopList
     */
    @RequestMapping("toMain")
    public String toIndex(Model model) {

        //查询男装类型
       List<TypeBean> typeManList = userService.findShopTypeManList();
       //查询女装类型
       List<TypeBean> typeList = userService.findShopTypeList();

        //查询女装
        List<ProductBean> list = userService.findShopList();
        //查询男装
        List<ProductBean> listMen = userService.findShopListMen();
        //返回女装数据
        model.addAttribute("list", list);
        //返回男装数据
        model.addAttribute("listMan", listMen);
        //返回女装类型数据
        model.addAttribute("typeList",typeList);
        //返回男装类型数据
        model.addAttribute("typeManList",typeManList);

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
        System.out.println("此用户购物车的商品有---》" + hashLength);
        model.addAttribute("count", hashLength);
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
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/queryShopDetails")
    public String queryShopDetails(Integer id, Model model) {
        //查询商品的详情
        ProductBean pro = userService.queryShopDetails(id);

        //在详情页面展示4条销量最高的数据
        List<ProductBean> list = userService.topSelling();
        List<String> shopImg = userService.queryShopImg(id);
        model.addAttribute("list", list);
        model.addAttribute("img", shopImg);
        model.addAttribute("pro", pro);
        return "jsp/product";
    }
}
