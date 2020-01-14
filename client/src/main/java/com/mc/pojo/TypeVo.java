package com.mc.pojo;

import lombok.Data;

import java.util.List;

@Data
public class TypeVo {
    private int code;
    private String msg;
    private int count;
    private List<Type> data;
}
