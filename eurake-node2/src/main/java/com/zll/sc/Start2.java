package com.zll.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Start2 {
    public static void main(String[] args) {
        System.out.println('111');
        SpringApplication.run(Start2.class);
    }
}
