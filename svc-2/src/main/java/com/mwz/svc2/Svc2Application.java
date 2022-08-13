package com.mwz.svc2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Svc2Application {

    public static void main(String[] args) {
        SpringApplication.run(Svc2Application.class, args);
    }

}
