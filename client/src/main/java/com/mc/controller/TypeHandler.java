package com.mc.controller;

import com.mc.feign.TypeFeign;
import com.mc.pojo.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/type")
public class TypeHandler {

    @Autowired
    private TypeFeign typeFeign;

    @GetMapping("/findTypes")
    @ResponseBody
    public List<Type> findTypes(){
        return typeFeign.findTypes();
    }

    @GetMapping("/save")
    public void save(Type type){
    
    }
}
