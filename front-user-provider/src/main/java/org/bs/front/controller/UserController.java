package org.bs.front.controller;

import org.bs.front.mapper.UserMapper;
import org.bs.front.pojo.user.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

       @Autowired
       private  UserMapper  userMapper;

       @GetMapping(value = "/login/namelogin")
       public UserBean queryUserName(@RequestParam("phone") String phone){
             return  userMapper.queryUserName(phone);
       }

       //注册用户
       @RequestMapping(value = "/users/toenroll",method = RequestMethod.POST)
       public  Boolean  saveUser(@RequestBody UserBean userBean){
              try {
                     userMapper.saveUser(userBean);
                     return  true;
              } catch (Exception e) {
                     e.printStackTrace();
                     return  false;
              }
       }

}
