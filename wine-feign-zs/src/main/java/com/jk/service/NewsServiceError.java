package com.jk.service;

import com.jk.model.WineImg;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@RequestMapping("/error")
@Component
public class NewsServiceError implements ServiceFeign {

    @Override
    public void addNews2(WineImg jiu) {

    }


}
