package org.bs.front;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient     //都是能够让注册中心能够发现，扫描到改服务
@EnableDiscoveryClient  //都是能够让注册中心能够发现，扫描到改服务
@EnableFeignClients //注解开启Feign的功能 Feign本身自带断路器
public class FrontShoppingCarConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrontShoppingCarConsumerApplication.class, args);
    }

}
