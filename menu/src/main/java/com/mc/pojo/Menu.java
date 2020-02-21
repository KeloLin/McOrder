package com.mc.pojo;

import lombok.Data;

@Data
public class Menu {
    private long menuId;
    private long parentIid;
    private String name;
    private double price;
    private String picUrl;
    private String desc;
    private Type type;
}
