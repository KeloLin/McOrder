package com.mc.feign;

import com.mc.hystrix.MenuHystrix;
import com.mc.pojo.Menu;
import com.mc.pojo.MenuVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "menu", fallback = MenuHystrix.class)
public interface MenuFeign {

    @GetMapping("/menu/findAll/{num}/{size}")
    public MenuVo findAll(@PathVariable("num") int num, @PathVariable("size") int size);

    @GetMapping("/menu/deleteById/{id}")
    public void deleteById(@PathVariable("id") long menuId);

    @PostMapping("/menu/save")
    public void save(Menu menu);

    @GetMapping("/menu/findMenuById/{id}")
    public Menu findMenuById(@PathVariable("id") long menuId);

    @PostMapping("/menu/update")
    public void update(Menu menu);
}
