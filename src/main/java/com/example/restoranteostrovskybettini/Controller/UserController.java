package com.example.restoranteostrovskybettini.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }



    @GetMapping("/hola")
        public String hola(){
            return "menu";
        }
    }

