package com.example.app.controller;

import com.example.app.entity.Res;
import com.example.app.entity.Student;
import com.example.app.entity.StudentRepository;
import com.example.app.entity.User;
import com.example.app.service.ResService;
import com.example.app.service.StudentService;
import com.example.app.service.UserService;
import com.example.app.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class infoController {
    @Autowired
    private UserService userService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private ResService resService;

    @RequestMapping("info_stu")
    public String info_stu(Model model){
        Integer abn_c;
        abn_c=userService.findabn_data();
        model.addAttribute("abn_c", abn_c);

        Integer today_c;
        today_c=userService.find_today_data();
        model.addAttribute("today_c",today_c);

        Integer not_c;
        not_c=userService.find_nodk_data();
        model.addAttribute("not_c", not_c);

        Integer res_c;
        res_c=resService.find_res_data();
        model.addAttribute("res_c", res_c);
        return "info_stu";
    }

    @RequestMapping("/info")
    public String info(Model model){
        List<User> userList = new ArrayList();
        userList=userService.findAll();
        model.addAttribute("userList",userList);

        List<Student> nodkList = new ArrayList();
        nodkList=studentService.find_nodk();
        model.addAttribute("nodkList",nodkList);

        List<User> abnList = new ArrayList();
        abnList=userService.findabn();
        model.addAttribute("abnList",abnList);

        Integer abn_c;
        abn_c=userService.findabn_data();
        model.addAttribute("abn_c", abn_c);

        Integer today_c;
        today_c=userService.find_today_data();
        model.addAttribute("today_c",today_c);

        Integer not_c;
        not_c=userService.find_nodk_data();
        model.addAttribute("not_c", not_c);

        List<User> infoList;
        infoList=userService.find_info();
        model.addAttribute("infoList", infoList);

        List<Res> resList;
        resList=resService.find_res();
        model.addAttribute("resList", resList);

        Integer res_c;
        res_c=resService.find_res_data();
        model.addAttribute("res_c", res_c);
        return "info";
    }


}
