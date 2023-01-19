package com.example.restoranteostrovskybettini.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class UserController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/userForm")
    public String getUserForm() {
        return "user-form";
    }
}
