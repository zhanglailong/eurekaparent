package com.zll.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Start3 {
    public static void main(String[] args) {
        SpringApplication.run(Start3.class);
    }
}
