package com.example.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "PROVIDER1")
@Service
public interface Feigncli1 {
    @GetMapping("/app/hello")
    public String hello();
}