package com.mc.mapper;

import com.mc.pojo.Menu;

public interface MenuMapper {
    public List<Menu> findAll();
    public int count();
    public Menu findMenuById(long id);
    public void save(Menu menu);
    public void update(Menu menu);
    public void deleteById(long id);
}
