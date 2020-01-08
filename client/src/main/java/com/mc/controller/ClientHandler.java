package com.mc.controller;

import com.mc.feign.MenuFeign;
import com.mc.pojo.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientHandler {

    @Autowired
    private MenuFeign menuFeign;

    @GetMapping("/findAll/{num}/{size}")
    public List<Menu> findAll(@PathVariable("num") int num, @PathVariable("size") int size){
        return menuFeign.findAll(num, size);
    }

}
