package com.mc.feign;

import com.mc.pojo.Menu;
import com.mc.pojo.MenuVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "menu")
public interface MenuFeign {

    @GetMapping("/menu/findAll/{num}/{size}")
    public MenuVo findAll(@PathVariable("num") int num, @PathVariable("size") int size);

    @DeleteMapping("/menu/deleteById/{id}")
    public void deleteById(@PathVariable("id") long mid);

    @PostMapping("/menu/save")
    public void save(Menu menu);

    @GetMapping("/menu/findMenuById/{id}")
    public Menu findMenuById(@PathVariable("id") long mid);

    @PutMapping("/menu/update")
    public void update(Menu menu);
}
