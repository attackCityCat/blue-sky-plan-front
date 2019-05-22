package org.bs.front;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@MapperScan("org.bs.front.mapper")
public class FrontUserProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrontUserProviderApplication.class, args);
    }

}
