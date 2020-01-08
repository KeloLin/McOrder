package com.mc.controller;

import com.mc.mapper.UserMapper;
import com.mc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserHandler {

    @Value("${server.port}")
    private String port;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/index")
    public String index(){
        return "端口为:" + this.port;
    }

    @GetMapping("/findAll/{num}/{size}")
    public List<User> findAll(@PathVariable("num") int num, @PathVariable("size") int size){
        return userMapper.findAll(num, size);
    }
}
