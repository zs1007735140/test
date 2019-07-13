package com.jk.controller;

import com.jk.model.WineImg;
import com.jk.service.ServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class JiuController {
    @Autowired
    private ServiceFeign serviceFeign;

    //新增图片
    @PostMapping("addNews2")
    public  void addNews2(WineImg jiu){
        serviceFeign.addNews2(jiu);
    }

    @RequestMapping("toShow")
    public ModelAndView toShow(ModelAndView mv){
        mv.setViewName("addimgoss");
        return mv;
    }
}
