package com.mwz.svc1.controller;

import com.mwz.svc1.feign.HelloApiClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @Autowired
    private HelloApiClient helloApiClient;

    @GetMapping("hello-svc1")
    public String hello() {
        return "hello svc1";
    }

    @GetMapping("hello-svc2")
    public String helloSvc2() {
        return helloApiClient.hello();
    }

}
