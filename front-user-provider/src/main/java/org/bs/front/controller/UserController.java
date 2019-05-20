package org.bs.front.controller;

import org.bs.front.mapper.UserMapper;
import org.bs.front.pojo.product.ProductBean;
import org.bs.front.pojo.user.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class UserController {

       @Autowired
       private  UserMapper  userMapper;
       
       @Resource
       private RedisTemplate<String,Object> redisTemplate;

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

       //找回密码
       @PutMapping("/retrieve/userRetrieve")
       public  Boolean  editRetrieve(@RequestParam("phone") String phone,@RequestParam("password") String password){
              try {
                     userMapper.editRetrieve(phone,password);
                     return  true;
              } catch (Exception e) {
                     e.printStackTrace();
                     return  false;
              }
       }

       @RequestMapping(value = "queryShopCarCount")
       public Integer queryShopCarCount(@RequestParam(value = "key") String key){

              //        查看对应Key中的所有数据展示
              Map<Object, Object> map = redisTemplate.opsForHash().entries(key);

              //将 缓存中的map转换成list数据 返回展示  强转
              List<ProductBean> list = (List) map.values().stream().collect(Collectors.toList());

              return 11;
       }

}
