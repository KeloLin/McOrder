package com.mc.hystrix;

import com.mc.feign.MenuFeign;
import com.mc.pojo.Menu;
import com.mc.pojo.MenuVo;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class MenuHystrix implements MenuFeign {

    @Override
    public MenuVo findAll(int num, int size) {
        MenuVo menuVo = new MenuVo(500, "The request was failed.", 0, null);
        return menuVo;
    }

    @Override
    public void deleteById(long menuId) {

    }

    @Override
    public void save(Menu menu) {

    }

    @Override
    public Menu findMenuById(long menuId) {
        return null;
    }

    @Override
    public void update(Menu menu) {

    }
}
