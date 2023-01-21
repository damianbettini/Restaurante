package com.example.restoranteostrovskybettini.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping({"/", "/login"})
    public String index() {
        return "index";
    }

    @GetMapping("/bienvenido")
    public String principal(){
        return "principal";
    }
    @GetMapping("/menu")
    public String menu(){
        return "menu";
    }



}

