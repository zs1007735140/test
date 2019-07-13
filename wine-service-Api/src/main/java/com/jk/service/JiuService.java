package com.jk.service;

import com.jk.model.WineImg;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface JiuService {

    @PostMapping("addNews2")
    void addNews2( WineImg jiu);
}
