package org.bs.front.controller;


import org.bs.front.mapper.UserMapper;
import org.bs.front.pojo.showproduct.ColorBean;
import org.bs.front.pojo.showproduct.ProductBean;
import org.bs.front.pojo.showproduct.SizeBean;
import org.bs.front.pojo.user.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

   @Autowired
    private UserMapper userMapper;



    @GetMapping(value = "/login/namelogin")
    public UserBean queryUserName(@RequestParam("phone") String phone) {
        return userMapper.queryUserName(phone);
    }

    //注册用户
    @RequestMapping(value = "/users/toenroll", method = RequestMethod.POST)
    public Boolean saveUser(@RequestBody UserBean userBean) {
        try {
            userMapper.saveUser(userBean);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //找回密码
    @PutMapping("/retrieve/userRetrieve")
    public Boolean editRetrieve(@RequestParam("phone") String phone, @RequestParam("password") String password) {
        try {
            userMapper.editRetrieve(phone, password);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //查询女装商品列表
   @RequestMapping(value = "findShopList")
    public List<ProductBean> findShopList() {
        return userMapper.findShopList();
    }

    //查询男装商品列表
   @RequestMapping(value = "findShopListMen")
    public List<ProductBean> findShopListMen() {
        return userMapper.findShopListMen();
    }

    //查询商品详情
    @RequestMapping("/queryShopDetails")
    public ProductBean queryShopDetails(@RequestParam(value = "id") Integer id){
        ProductBean productBean = userMapper.queryShopDetails(id);
        return productBean;
    }

    //查询商品详情的图片
    @RequestMapping("/queryShopImg")
    List<String> queryShopImg(@RequestParam(value = "id") Integer id){
        return userMapper.queryShopImg(id);
    }

    //查出销量最高的4条数据
    @RequestMapping("/topSelling")
    public List<ProductBean> topSelling(){
        return userMapper.topSelling();
    }

    /**
     * 获取规格列表
     * @return
     */
    @RequestMapping(value = "/findSizeList")
    List<SizeBean> findSizeList(){
        return userMapper.findSizeList();
    };


    /**
     * 获取颜色列表
     * @return
     */
    @RequestMapping(value = "/findColorList")
    List<ColorBean> findColorList(){
        return userMapper.findColorList();
    };

    @RequestMapping("/findStore")
    ProductBean findStore(@RequestParam("title") String title,@RequestParam("colorId") Integer colorId,@RequestParam("sizeId") Integer sizeId){
        ProductBean store = userMapper.findStore(title, colorId, sizeId);
        return store;
    };

}
