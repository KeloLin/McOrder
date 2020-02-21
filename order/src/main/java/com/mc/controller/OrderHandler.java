package com.mc.controller;

import com.mc.mapper.OrderMapper;
import com.mc.pojo.Order;
import com.mc.service.OrderService;
import com.mc.util.OrderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderHandler {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order/{method}/{id}")
    public List<Order> findAllOrder(@PathVariable("method") String method, @PathVariable("id") long id){
        List<Order> list = new ArrayList<>(20);
        if (null != method && !"".equals(method)){

            if(OrderUtil.SELECT_METHOD_ORDER.equals(method)){
                list = orderService.findAllOrderByOrderId(id);
            }

            if(OrderUtil.SELECT_METHOD_USER.equals(method)){
                list = orderService.findAllOrderByUserId(id);
            }
        }
        return list;
    }

    @PostMapping("/commit")
    public String saveOrder(@RequestBody Order order){

        return null;
    }

}
