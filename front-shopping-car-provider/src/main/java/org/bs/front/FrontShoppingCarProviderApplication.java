package org.bs.front;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //代表是客户端注册到注册中心
@MapperScan("org.bs.front.mapper")
public class FrontShoppingCarProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrontShoppingCarProviderApplication.class, args);
    }

}
