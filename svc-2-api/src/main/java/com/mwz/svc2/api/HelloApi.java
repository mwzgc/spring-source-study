package com.mwz.svc2.api;

import org.springframework.web.bind.annotation.GetMapping;

public interface HelloApi {

    String SERVICE_ID = "svc2";

    @GetMapping("hello")
    String hello();

}
