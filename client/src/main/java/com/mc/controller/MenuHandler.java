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

    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") long mid){
        menuFeign.deleteById(mid);
        return "redirect:/menu/redirect/index";
    }

    @GetMapping("/menuAdd")
    public ModelAndView menuAdd(){
        ModelAndView modelAndView = new ModelAndView("menu_add");
        modelAndView.addObject("list",typeFeign.findTypes());
        return modelAndView;
    }

    @GetMapping("/menuUpdate")
    public ModelAndView menuUpdate(@PathVariable("id") long mid){
        ModelAndView modelAndView = new ModelAndView("menu_update");

        modelAndView.addObject("menu",menuFeign.findMenuById(mid));
        modelAndView.addObject("list",typeFeign.findTypes());
        return modelAndView;
    }

    @PostMapping("/save")
    public String save(Menu menu){
        menuFeign.save(menu);
        return "redirect:/menu/redirect/index";
    }

    @PutMapping("/update")
    public String update(Menu menu){
        menuFeign.update(menu);
        return "redirect:/menu/redirect/index";
    }
}
