package com.zpain.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController2 {

    @Value("${value-test:12}")
    private String a;

    @GetMapping("/getValue")
    public String getValue(){
        return a;
    }
}
