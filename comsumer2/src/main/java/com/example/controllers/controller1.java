package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class controller1 {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/ribbon")
    public String hello() {
        return restTemplate.getForObject("http://provider1/app/hello",String.class);
    }
}