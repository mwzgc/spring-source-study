package com.mwz.grpc.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GrpcServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcServiceApplication.class, args);
    }

}
