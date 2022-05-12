package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 陈磊
 * @version 2.0
 * @date 2022/5/11 23:03
 */
@Controller
public class Controllers {
    @RequestMapping("/hello")
    public String hello () {
        return "index";
    }
}
