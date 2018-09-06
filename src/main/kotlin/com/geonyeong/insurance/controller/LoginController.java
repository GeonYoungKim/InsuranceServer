package com.geonyeong.insurance.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController {

    @GetMapping("/create")
    public String signUp(){
        System.out.println("유저 생성");
        return "hello create";
    }
}
