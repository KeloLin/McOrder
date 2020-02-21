package com.mc.mapper;


import com.mc.pojo.OrderDetail;

import java.util.List;

public interface OrderDetailMapper {
    List<OrderDetail> findAllDetailByOrderId(long orderid);
    void saveOrderDetail(OrderDetail orderDetail);
    void saveOrderDetailList(List<OrderDetail> list);
}
