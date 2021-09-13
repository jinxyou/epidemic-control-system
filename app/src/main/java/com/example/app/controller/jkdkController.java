package com.example.app.controller;


import com.example.app.entity.User;
import com.example.app.service.UserService;
import com.example.app.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jkdkController {

    @Autowired
    private UserService userService;

    @RequestMapping("/jkdk")
    public String jkdk(){
        return "jkdk";
    }

    @RequestMapping("/add")
    public String add(User user){
        userService.save(user);
        return "success";
    }

    @RequestMapping("/success")
    public String success(){
        return "success";
    }
}
