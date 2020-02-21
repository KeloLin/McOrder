package com.mc.mapper;


import com.mc.pojo.Order;

import java.util.List;

public interface OrderMapper {
    List<Order> findAllOrderByUserId(long userId);
    List<Order> findAllOrderByOrderId(long orderId);
}
