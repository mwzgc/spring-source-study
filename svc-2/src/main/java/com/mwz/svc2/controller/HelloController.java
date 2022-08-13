package com.mwz.svc2.controller;

import com.mwz.svc2.api.HelloApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController implements HelloApi {

    public String hello() {
        log.info("svc2");
        return "hello svc2";
    }

}
