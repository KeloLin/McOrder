package com.mc.mapper;

import com.mc.pojo.Menu;

import java.util.List;

public interface MenuMapper {
    public List<Menu> findAll(int pageNum, int pageSize);
    public int count();
    public Menu findMenuById(long menuId);
    public void save(Menu menu);
    public void update(Menu menu);
    public void deleteById(long menuId);
}
