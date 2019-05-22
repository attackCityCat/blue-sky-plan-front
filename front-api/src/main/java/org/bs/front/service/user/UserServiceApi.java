package org.bs.front.service.user;

import org.bs.front.pojo.user.UserBean;
import org.springframework.web.bind.annotation.*;


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
}
