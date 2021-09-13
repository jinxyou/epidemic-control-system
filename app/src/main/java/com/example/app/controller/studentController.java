package com.example.app.controller;

import com.example.app.entity.Student;
import com.example.app.entity.User;
import com.example.app.service.StudentService;
import com.example.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class studentController {
    @Autowired
    private StudentService studentService;

    @Autowired
    private UserService userService;

    public String U_ID;

    //梦开始的地方
    @RequestMapping("/login")
    public String login(){
        return "login";
    }


    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/adduser")
    public String adduser(Student student){
        studentService.save(student);
        return "login";
    }

    @RequestMapping("ss")
    @ResponseBody
    public String toShips(String UID,String password){

        U_ID=UID;

        String PASSWORD=studentService.find_byid(Integer.valueOf(UID));

        if(UID.startsWith("10") &&PASSWORD.equals(password))
            return "管理员";
        else if(UID.startsWith("18")&&PASSWORD.equals(password))
            return "学生";
        else
            return "不存在";

    }
    //满足条件跳转到学生信息界面
    @RequestMapping("studentships")
    public String tostudent(Model model){

        List<Student> userList = new ArrayList();
        userList=studentService.find_id(U_ID);

        model.addAttribute("name",studentService.findname_BYid(U_ID));
        model.addAttribute("userList",userList);

        return "studentships";
    }
    //满足条件跳转到管理员信息界面
    @RequestMapping("aster")
    public String toadminister(Model model){
        List<Student> userList = new ArrayList();
        userList=studentService.find_id(U_ID);

        model.addAttribute("name",studentService.findname_BYid(U_ID));
        model.addAttribute("userList",userList);
        return "aster";
    }
}
