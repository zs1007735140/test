package com.jk.controller;

import com.jk.model.WineImg;
import com.jk.service.JiuService;
import com.jk.service.JiuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlllerPro implements JiuService {
    @Autowired
    private JiuServiceImpl jiuServiceImpl;

    @Override
    @PostMapping("addNews2")
    public void addNews2( WineImg jiu) {
        jiuServiceImpl.addNews2(jiu);
    }
}
