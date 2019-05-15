package org.bs.front;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FrontEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrontEurekaApplication.class, args);
    }

}
