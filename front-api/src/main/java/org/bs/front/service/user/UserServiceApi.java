package org.bs.front.service.user;

import org.bs.front.pojo.product.ProductBean;
import org.bs.front.pojo.user.CityBean;
import org.bs.front.pojo.user.UserBean;
import org.bs.front.util.EasyuiDategrid;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public interface UserServiceApi {

    //登录
    @GetMapping("/login/namelogin")
    UserBean queryUserName(@RequestParam("phone") String phone);

    //注册用户
    @RequestMapping(value = "/users/toenroll",method = RequestMethod.POST)
    void saveUser(@RequestBody UserBean userBean);

    //找回密码
    @PutMapping("/retrieve/userRetrieve")
    void editRetrieve(@RequestParam("phone") String phone, @RequestParam("password") String password);

    //修改密码
    @PutMapping("/users/userPassword")
    void editPassword(@RequestParam("id") Integer id, @RequestParam("password") String password);

    //跟新保存
<<<<<<< HEAD
    @RequestMapping("/users/userFrom")
    void editUserFrom(@RequestBody UserBean userBean);

    //商品列表
    @GetMapping("/users/queryProduct")
    List<ProductBean> queryProduct();

    //三级联动
    @GetMapping("/city/queryProvince")
    List<CityBean> queryProvince(@RequestParam("id") Integer id);
=======
    @PutMapping("/users/userFrom")
    void editUserFrom(@RequestBody UserBean userBean);
>>>>>>> 9e5f4a6e96bf301efd9a9756f4a3bbaf158bfb94
}
