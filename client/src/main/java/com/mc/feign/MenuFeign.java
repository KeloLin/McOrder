package com.mc.feign;

import com.mc.pojo.Menu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "menu")
public interface MenuFeign {

    @GetMapping("/menu/findAll/{num}/{size}")
    public List<Menu> findAll(@PathVariable("num") int num, @PathVariable("size") int size);

}
