package com.jwt.jwtDemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/do")
    public String home() {
        return "Welcome to jwtDemo Project!";
    }

    @GetMapping("/user")
    public String user() {
        return " hay vicky This  is USER endpoint";
    }

    @GetMapping("/admin")
    public String admin() {
        return "hay vicky This is ADMIN endpoint";
    }
}
