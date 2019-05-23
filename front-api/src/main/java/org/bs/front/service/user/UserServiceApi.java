package org.bs.front.service.user;

import org.bs.front.pojo.showproduct.ColorBean;
import org.bs.front.pojo.showproduct.ProductBean;
import org.bs.front.pojo.showproduct.SizeBean;
import org.bs.front.pojo.showproduct.TypeBean;
import org.bs.front.pojo.user.UserBean;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public interface UserServiceApi {

    //登录
    @RequestMapping("/login/namelogin")
    UserBean queryUserName(@RequestParam(value = "phone") String phone);

    //注册用户
    @RequestMapping(value = "/users/toenroll",method = RequestMethod.POST)
    void saveUser(@RequestBody UserBean userBean);

    //找回密码
    @PutMapping("/retrieve/userRetrieve")
    void editRetrieve(@RequestParam("phone") String phone, @RequestParam("password") String password);

    /**
     * 查询用户购物车商品的数量
     * @param key
     * @return
     */
    @RequestMapping(value = "queryShopCarCount")
    Integer queryShopCarCount(@RequestParam(value = "key") String key);

    //查询女装商品列表
    @RequestMapping(value = "findShopList")
    List<ProductBean> findShopList();

    //查询男装商品列表
    @RequestMapping(value = "findShopListMen")
    List<ProductBean> findShopListMen();

    //查询商品详情
    @RequestMapping("/queryShopDetails")
    ProductBean queryShopDetails(@RequestParam(value = "id") Integer id);

    //查询商品详情的图片
    @RequestMapping("/queryShopImg")
    List<String> queryShopImg(@RequestParam(value = "id") Integer id);

    //查出销量最高的4条数据
    @RequestMapping("/topSelling")
    List<ProductBean> topSelling();

    //查询男装类型
    @RequestMapping("/findShopTypeManList")
    List<TypeBean> findShopTypeManList();
    //查询女装类型
    @RequestMapping("/findShopTypeList")
    List<TypeBean> findShopTypeList();

    //根据商品名 和颜色查询 对应商品
    @RequestMapping("/findShopByColor")
    ProductBean findShopByColor(@RequestBody ProductBean productBean);

    @RequestMapping(value = "/findSizeList")
    List<SizeBean> findSizeList();

    @RequestMapping(value = "/findColorList")
    List<ColorBean> findColorList();

    @RequestMapping("/findStore")
    ProductBean findStore(@RequestParam("title") String title,@RequestParam("colorId") Integer colorId,@RequestParam("sizeId") Integer sizeId);
}
