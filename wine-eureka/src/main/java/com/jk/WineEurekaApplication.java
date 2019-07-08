package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WineEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(WineEurekaApplication.class, args);
    }

}
