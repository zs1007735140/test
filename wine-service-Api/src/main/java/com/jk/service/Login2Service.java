package com.jk.service;

import com.jk.bean.LoginBean;
import com.jk.bean.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

public interface Login2Service {


    User getUserByUsernamePwd(User user);

    String gainMessgerCode(String phoneNumber, HttpSession session);

    String messageLogin(String name, String messageCode, HttpSession session);

    HashMap<String, Object> login(LoginBean loginBean, HttpServletRequest request);
}
