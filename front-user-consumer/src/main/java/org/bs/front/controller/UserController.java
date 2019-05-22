package org.bs.front.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.netflix.ribbon.proxy.annotation.Http;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.bs.front.common.ConstantConf;
import org.bs.front.constant.ConstantClass;
import org.bs.front.pojo.user.UserBean;
import org.bs.front.service.UserService;
import org.bs.front.utils.HttpClientUtil;
import org.bs.front.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

@RestController
public class UserController {

       @Autowired
       private  UserService  userService;

       @Resource
       private   RedisTemplate<String,Object>   redisTemplate;

       @PostMapping("/login/login")
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

    /**
     * 获取验证码
     * @param account
     * @return
     */
       @RequestMapping(value = "/code/findSendCode")
       public   HashMap<String, Object> findSendCode(String account) {

           HashMap<String, Object> result = new HashMap<>();

           try {

               Integer code = (int)((Math.random() * 9 + 1) * 100000);
               System.out.println(code);
               HashMap<String, Object> params = new HashMap<>();

               params.put("accountSid", ConstantConf.SMS_ACCOUNTSID);

               params.put("to", account);

               String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
               System.out.println(timestamp);
               params.put("timestamp", timestamp);

               String sig = Md5Util.getMd532(ConstantConf.SMS_ACCOUNTSID + ConstantConf.SMS_AUTH_TOKEN + timestamp);
               params.put("sig", sig);

               params.put("templateid", ConstantConf.SMS_TEMPLATEID);

               params.put("param", code);

               String post = HttpClientUtil.post(ConstantConf.SMS_URL, params);
               JSONObject parseObject = JSON.parseObject(post);

               String resCode = parseObject.getString("respCode");
               System.out.println(resCode);

               if (parseObject.getString("respCode").equals(ConstantConf.SMS_RESPCODE)) {
                   // 调用redis将验证码缓存起来
                   String cacheKey = ConstantConf.SMS_CODE_CACHE_KEY+account;

                   redisTemplate.opsForValue().set(cacheKey, String.valueOf(code),ConstantConf.SMS_CODE_TIME_OUT,TimeUnit.MINUTES);

                   result.put("code", 0);
                   result.put("msg", "发送成功");
                   return result;
               } else {
                   result.put("code", 1);
                   result.put("msg", "发送失败");
                   return result;
               }
           } catch (Exception e) {
               e.printStackTrace();
               result.put("code", 2);
               result.put("msg", "发送失败");
               return result;
           }
       }


    /***
     * 找回密码
     * @param phone
     * @param yanzhen
     * @param password
     * @param session
     * @return
     */
     @PutMapping("/retrieve/userRetrieve")
     public  Boolean  editRetrieve(String phone,String yanzhen,String password){
         try {

             String cacheKey = ConstantConf.SMS_CODE_CACHE_KEY+phone;
             String string = redisTemplate.opsForValue().get(cacheKey).toString();

             if(string.equals(yanzhen)){
                 userService.editRetrieve(phone,password);
             }
             return  true;
         } catch (Exception e) {
             e.printStackTrace();
             return  false;
         }
     }
}
