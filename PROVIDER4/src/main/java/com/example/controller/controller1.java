package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/app")
public class controller1 {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("success444: 我是来自服务端的接口");
        return "success444: 我是来自服务端的接口";
    }
}
