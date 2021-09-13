package com.example.app.controller;

import com.example.app.entity.Res;
import com.example.app.service.ResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class wzslController {
    @Autowired
    ResService resService;

    @RequestMapping("/wzsl")
    public String wzsl(){
        return "wzsl";
    }

    @RequestMapping("/submit_res")
    public String submit_res(Res res){
        resService.save(res);
        return "success";
    }

    @RequestMapping("/mark/{id}")
    public String mark(@PathVariable Integer id){
        resService.del(id);
        return "redirect:/info";
    }

}
