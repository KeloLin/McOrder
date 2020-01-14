package com.mc.controller;

import com.mc.mapper.TypeMapper;
import com.mc.pojo.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/type")
public class TypeHandler {

    @Autowired
    private TypeMapper typeMapper;

    @GetMapping("/findTypes")
    public List<Type> findTypes(){
        List<Type> list = typeMapper.findAll();
        return list;
    }
}
