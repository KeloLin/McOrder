package com.mc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuVo {
    private int code;
    private String msg;
    private int count;
    private List<Menu> data;
}
