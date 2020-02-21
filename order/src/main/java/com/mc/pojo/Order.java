package com.mc.pojo;

import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
public class Order {
    private long orderId;
    private String serialNumber;
    private String orderNumber;
    private long userId;
    private double price;
    private Date orderTime;
    private Date commitTime;
    private Date endTime;
    private int status;
    private List<OrderDetail> details;
}
