package org.bs.front.controller;


import org.bs.front.mapper.UserMapper;
import org.bs.front.pojo.showproduct.ProductBean;
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

    //查询商品列表
   @RequestMapping(value = "findShopList")
    public List<ProductBean> findShopList() {
        return userMapper.findShopList();
    }

}
