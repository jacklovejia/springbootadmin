package com.jack.eurekaclientone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientOneApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientOneApp.class, args);
    }
}
