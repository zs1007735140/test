package com.jk.mapper;


import com.jk.model.WineImg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface JiuMapper {
    void addNews2(WineImg jiu);
}
