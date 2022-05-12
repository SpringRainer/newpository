package com.example;

import org.springframework.stereotype.Component;

/**
 * @author 陈磊
 * @version 2.0
 * @date 2022/5/11 23:03
 */
@Component
public class Service {
    public String control() {
        System.out.println("你好世界");
        return "你好";
    }
}
