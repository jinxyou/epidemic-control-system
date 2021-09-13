package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class indexController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("index_admin")
    public String index_admin(){
        return "index_admin";
    }
}
