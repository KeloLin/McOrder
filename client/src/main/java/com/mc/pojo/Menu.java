package com.mc.pojo;

import lombok.Data;

@Data
public class Menu {
    private long mid;
    private String name;
    private double price;
    private String desc;
    private long typeid;
}
