package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {


    @RequestMapping("treeList")
    public String treeList(){

        return "tree";
    }

    @RequestMapping("userList")
    public String userList(){

        return "show";
    }

    @RequestMapping("mongoduserList")
    public String mongoduserList(){

        return "mongodb";
    }

    @RequestMapping("login")
    public String login(){

        return "login";
    }

    @RequestMapping("pinlun")
    public String pinlun(){

        return "pinglun";
    }


    @RequestMapping("login3")
    public String denglu(){

        return "login3";
    }


    @RequestMapping("login2")
    public String login3(){

        return "login2";
    }

    @RequestMapping("log")
    public String log(){

        return "log";
    }

}
