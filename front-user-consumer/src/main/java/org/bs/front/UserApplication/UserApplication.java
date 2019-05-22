package org.bs.front.UserApplication;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration
@EnableRedisHttpSession
public class UserApplication {
/**
 * 据说写一个这个就能多模块共享session了
 * 如果不行就放到zuul网关试试
 * EnableRedisHttpSession
 * 具体信息百度以上注解
 */
}
