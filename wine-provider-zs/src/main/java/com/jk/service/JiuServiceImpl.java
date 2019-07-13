package com.jk.service;

import com.jk.mapper.JiuMapper;
import com.jk.model.WineImg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JiuServiceImpl implements JiuService {
    @Autowired
    private JiuMapper jiuMapper;

    @Override
    public void addNews2(WineImg jiu) {
        jiuMapper.addNews2(jiu);
    }
}
