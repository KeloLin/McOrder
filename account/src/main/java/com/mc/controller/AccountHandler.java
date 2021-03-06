package com.mc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountHandler {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/index")
    private String index(){
        return "端口为：" + this.port;
    }
}
