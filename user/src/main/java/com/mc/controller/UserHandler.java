package com.mc.controller;

import com.mc.mapper.UserMapper;
import com.mc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/findAll/{num}/{size}")
    public List<User> findAll(@PathVariable("num") int num, @PathVariable("size") int size){
        return userMapper.findAll(num, size);
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") long userId){
        return userMapper.findById(userId);
    }

    @PostMapping("/save")
    public void save(@RequestBody User user){
        userMapper.save(user);
    }

    @PostMapping("/update")
    public void update(@RequestBody User user){
        userMapper.update(user);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long userId){
        userMapper.deleteById(userId);
    }
}
