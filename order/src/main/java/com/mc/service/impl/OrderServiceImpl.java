package com.mc.service.impl;

import com.mc.mapper.OrderMapper;
import com.mc.pojo.Order;
import com.mc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> findAllOrderByUserId(long userId) {
        return orderMapper.findAllOrderByUserId(userId);
    }

    @Override
    public List<Order> findAllOrderByOrderId(long orderId) {
        return orderMapper.findAllOrderByOrderId(orderId);
    }

    @Override
    public void saveOrder(Order order) {

    }
}
