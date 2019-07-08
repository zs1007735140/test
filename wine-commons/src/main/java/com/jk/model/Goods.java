package com.jk.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Classname 曹龙启
 * @Description TODO
 * @Date 2019/7/8 21:22
 * @Created by ${jmh}
 */
public class Goods implements Serializable {


          private  Integer  goodId;

          private  String   goodName;

          private   String  goodDate;

          private   BigDecimal  goodPrice;

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodDate() {
        return goodDate;
    }

    public void setGoodDate(String goodDate) {
        this.goodDate = goodDate;
    }

    public BigDecimal getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(BigDecimal goodPrice) {
        this.goodPrice = goodPrice;
    }
}
