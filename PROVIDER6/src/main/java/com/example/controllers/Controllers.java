package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controllers {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "zookeeper 作为注册中心 控制器返回成功 !!!";
    }
}