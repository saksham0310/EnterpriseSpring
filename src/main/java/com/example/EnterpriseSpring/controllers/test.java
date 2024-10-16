package com.example.EnterpriseSpring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @GetMapping("value")
    public String value(){
        return "Hello Worls";
    }
}
