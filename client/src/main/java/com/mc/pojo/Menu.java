package com.mc.pojo;

import lombok.Data;

@Data
public class Menu {
    private long mid;
    private long parentid;
    private String name;
    private double price;
    private String picurl;
    private String desc;
    private Type type;
}
