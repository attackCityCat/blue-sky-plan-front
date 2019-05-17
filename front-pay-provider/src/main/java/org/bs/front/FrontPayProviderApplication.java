package org.bs.front;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("org.bs.front.mapper")
public class FrontPayProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrontPayProviderApplication.class, args);
    }

}
