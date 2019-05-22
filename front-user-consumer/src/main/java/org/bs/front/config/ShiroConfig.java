package org.bs.front.config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpSession;
import java.util.LinkedHashMap;

@Configuration
public class ShiroConfig {

    /**
     * ShiroFilterFactoryBean 处理拦截资源文件问题。
     * 注意：单独一个ShiroFilterFactoryBean配置是或报错的，因为在初始化ShiroFilterFactoryBean的时候需要注入：SecurityManager
     * Filter Chain定义说明 1、一个URL可以配置多个Filter，使用逗号分隔 2、当设置多个过滤器时，全部验证通过，才视为通过
     * 3、部分过滤器可指定参数，如perms，roles
     */
    @Bean
    public  ShiroFilterFactoryBean  getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        shiroFilterFactoryBean.setLoginUrl("/page/toLogin");
        shiroFilterFactoryBean.setUnauthorizedUrl("/page/to403");

        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
        map.put("/code/findSendCode","anon");
        map.put("/retrieve/userRetrieve","anon");
        map.put("/users/toenroll","anon");
        map.put("/login/login","anon");
        map.put("/page/toEnroll","anon");
        map.put("/page/toUser","anon");
        map.put("/page/toFreeCenter","anon");
        map.put("/page/toMain","anon");
        map.put("/page/toRetrieve","anon");
        map.put("/js/*","anon");
        map.put("/img/*","anon");
        map.put("/*/*","authc");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);
        return  shiroFilterFactoryBean;
    }

    @Bean(name = "securityManager")
    public  DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        //设置Realm
        securityManager.setRealm(userRealm);
        return  securityManager;
}

    @Bean(name = "userRealm")
    public   UserRealm  getUserRealm(){
        UserRealm userRealm = new UserRealm();
        return  userRealm;
    }
}
