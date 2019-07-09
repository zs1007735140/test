package com.jk.controller;

import com.jk.bean.LoginBean;
import com.jk.service.Login2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
@RequestMapping("log")
public class Login2Controller {

    @Autowired
    private Login2Service loginServcie;


    //获取短信验证码
    @RequestMapping("gainMessgerCode")
    @ResponseBody
    public String gainMessgerCode(String phoneNumber, HttpSession session){

        return loginServcie.gainMessgerCode(phoneNumber,session);
    }
    //短信验证码登录
    @RequestMapping("messageLogin")
    @ResponseBody
    public String messageLogin(String name,String messageCode,HttpSession session){
        return loginServcie.messageLogin(name,messageCode,session);
    }

    @RequestMapping("login2")
    @ResponseBody
    public HashMap<String,Object> login(LoginBean loginBean, HttpServletRequest request) {

        return loginServcie.login(loginBean,request);
    }
}
