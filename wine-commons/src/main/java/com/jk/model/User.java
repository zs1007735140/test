package com.jk.bean;

import lombok.Data;

@Data
public class User {

    private Integer id;

    private String  name;

    private  Integer  sex;

    private  String password;

    private  String createTime;
}
