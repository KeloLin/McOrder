package com.mc.controller;

import com.mc.mapper.MenuMapper;
import com.mc.mapper.TypeMapper;
import com.mc.pojo.Menu;
import com.mc.pojo.MenuVo;
import com.mc.pojo.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuHandler {

    @Value("${server.port}")
    private String port;

    @Autowired
    private MenuMapper menuMapper;

    @GetMapping("/findAll/{num}/{size}")
    public MenuVo findAll(@PathVariable("num") int num, @PathVariable("size") int size){
        List<Menu> list = menuMapper.findAll(num, size);
        MenuVo menuVo = new MenuVo(0, "", menuMapper.count(), list);
        return menuVo;
    }

    @GetMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long menuId){
        menuMapper.deleteById(menuId);
    }

    @PostMapping("/save")
    public void save(@RequestBody Menu menu){
        menuMapper.save(menu);
    }

    @GetMapping("/findMenuById/{id}")
    public Menu findMenuById(@PathVariable("id") long menuId){
        return menuMapper.findMenuById(menuId);
    }

    @PostMapping("/update")
    public void update(@RequestBody Menu menu){
        menuMapper.update(menu);
    }


}
