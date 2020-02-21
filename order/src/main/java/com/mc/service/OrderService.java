package com.mc.service;

import com.mc.pojo.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    List<com.mc.pojo.Order> findAllOrderByUserId(long userId);
    List<Order> findAllOrderByOrderId(long orderId);
    void saveOrder(Order order);
}
