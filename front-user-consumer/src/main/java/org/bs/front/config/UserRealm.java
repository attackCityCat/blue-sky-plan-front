package org.bs.front.config;


import jdk.nashorn.internal.ir.annotations.Reference;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.bs.front.pojo.user.UserBean;
import org.bs.front.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import java.nio.file.spi.FileSystemProvider;
import java.util.Enumeration;
import java.util.HashSet;

public class UserRealm extends AuthorizingRealm {

     @Autowired
     private  UserService  userService;

    /**
     * 授权器
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("权限逻辑");
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        HashSet<String> roles = new HashSet<>();

        return info;
    }

    /**
     * 认证器
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("认证逻辑");
        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
        String phone = token.getUsername();
        UserBean userBean = userService.queryUserName(phone);
        if(userBean == null){
            return null;
        }
        return  new SimpleAuthenticationInfo(userBean,userBean.getPassword(),this.getClass().getName());
    }

}
