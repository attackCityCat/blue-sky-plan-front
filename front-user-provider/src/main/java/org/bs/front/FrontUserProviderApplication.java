package org.bs.front;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FrontUserProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrontUserProviderApplication.class, args);
    }

}
