package com.example.controller;

import com.example.feignclient.Feigncli1;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class controller1 {
    @Autowired
    private Feigncli1 feigncli1;

    @GetMapping("/feign")
    @ResponseBody
    @HystrixCommand
    public String feign() {
        System.out.println(feigncli1.hello());
        return "success";
    }

//    public String errorCode(){
//        return "熔断成功 熔断代码 500";
//    }
    @RequestMapping("/cycle")
    public String cycle(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.sendRedirect("/cycle");
        return "cycle";
    }
}