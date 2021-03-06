package com.mc.controller;

import com.mc.feign.MenuFeign;
import com.mc.feign.TypeFeign;
import com.mc.pojo.Menu;
import com.mc.pojo.MenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/menu")
public class MenuHandler {

    @Autowired
    private MenuFeign menuFeign;
    @Autowired
    private TypeFeign typeFeign;

    @GetMapping("/findAll")
    @ResponseBody
    public MenuVo findAll(@RequestParam("page") int num, @RequestParam("limit") int size){
        int index = (num - 1)*size;
        return menuFeign.findAll(index, size);
    }

    @GetMapping("/redirect/{location}")
    public String redirect(@PathVariable("location") String location){
        return location;
    }

    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") long menuId){
        menuFeign.deleteById(menuId);
        return "redirect:/menu/redirect/index";
    }

    @GetMapping("/menuAdd")
    public ModelAndView menuAdd(){
        ModelAndView modelAndView = new ModelAndView("menu_add");
        modelAndView.addObject("list",typeFeign.findTypes());
        return modelAndView;
    }

    @GetMapping("/menuUpdate/{id}")
    public ModelAndView menuUpdate(@PathVariable("id") long menuId){
        ModelAndView modelAndView = new ModelAndView("menu_update");

        modelAndView.addObject("menu",menuFeign.findMenuById(menuId));
        modelAndView.addObject("list",typeFeign.findTypes());
        return modelAndView;
    }

    @PostMapping("/save")
    public String save(Menu menu){
        menuFeign.save(menu);
        return "redirect:/menu/redirect/index";
    }

    @PostMapping("/update")
    public String update(Menu menu){
        menuFeign.update(menu);
        return "redirect:/menu/redirect/index";
    }
}
