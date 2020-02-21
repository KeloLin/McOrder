package com.mc.pojo;

import lombok.Data;

@Data
public class OrderDetail {
    private long orderId;
    private long menuId;
    private double price;
}
