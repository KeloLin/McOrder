package com.mc.feign;

import com.mc.pojo.Type;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "menu")
public interface TypeFeign {

    @GetMapping("/type/findTypes")
    public List<Type> findTypes();
}
