package org.bs.front.controller;

import com.alibaba.fastjson.JSON;
import com.netflix.ribbon.proxy.annotation.Http;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.bs.front.pojo.user.UserBean;
import org.bs.front.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class UserController {

       @Autowired
       private  UserService  userService;

       @Autowired
       private   RedisTemplate<String,String>   redisTemplate;

       @GetMapping("/login/login")
       public HashMap<String,Object> login(UserBean userBean,HttpSession session ){
           HashMap<String, Object> result = new HashMap<String, Object>();
           Subject subject = SecurityUtils.getSubject();
           UsernamePasswordToken token = new UsernamePasswordToken(userBean.getPhone(),userBean.getPassword());

           try{

               subject.login(token);
               result.put("code",0);
               result.put("msg","登录成功");
               UserBean user = (UserBean) subject.getPrincipal();
               session.setAttribute(session.getId(),user);
               return  result;
           }catch(UnknownAccountException e){
               result.put("code",1);
               result.put("msg","用户名不存在");
               return  result;
           }catch(IncorrectCredentialsException e){
               result.put("code",2);
               result.put("msg","密码错误");
               return  result;
           }
       }

       //注册用户
       @RequestMapping(value = "/users/toenroll",method = RequestMethod.POST)
       public  Boolean  saveUser(UserBean userBean){
           try {
               userService.saveUser(userBean);
               return  true;
           } catch (Exception e) {
               e.printStackTrace();
               return  false;
           }
       }
}
