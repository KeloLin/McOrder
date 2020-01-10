package com.mc.feign;

import com.mc.pojo.MenuVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "menu")
public interface MenuFeign {

    @GetMapping("/menu/findAll/{num}/{size}")
    public MenuVo findAll(@PathVariable("num") int num, @PathVariable("size") int size);

    @GetMapping("/menu/deleteById/{id}")
    public String deleteById(@PathVariable("id") long mid);

}
