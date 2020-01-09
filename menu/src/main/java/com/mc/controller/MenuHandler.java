package com.mc.controller;

import com.mc.mapper.MenuMapper;
import com.mc.pojo.Menu;
import com.mc.pojo.MenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuHandler {

    @Value("${server.port}")
    private String port;

    @Autowired
    private MenuMapper menuMapper;

    @GetMapping("/index")
    public String index(){
        return "端口:"+this.port;
    }

    @GetMapping("/findAll/{num}/{size}")
    public MenuVo findAll(@PathVariable("num") int num, @PathVariable("size") int size){
        List<Menu> list = menuMapper.findAll(num, size);
        MenuVo menuVo = new MenuVo(0, "", menuMapper.count(), list);
        return menuVo;
    }

}
