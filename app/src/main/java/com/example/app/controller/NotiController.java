package com.example.app.controller;

import com.example.app.entity.Noti;
import com.example.app.service.NotiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Column;
import java.util.ArrayList;
import java.util.List;

@Controller
public class NotiController {
    @Autowired
    NotiService notiService;

    @RequestMapping("/noti")
    public String noti(Model model){
        List<Noti> notiList = new ArrayList();
        notiList = notiService.find_noti();
        model.addAttribute("notiList", notiList);
        return "notification";
    }

    @RequestMapping("/post")
    public String post(){
        return "post";
    }

    @RequestMapping("/postnoti")
    public String postnoti(Noti noti){
        notiService.save(noti);
        return "success";
    }
}
