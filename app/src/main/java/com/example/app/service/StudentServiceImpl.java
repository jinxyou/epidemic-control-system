package com.example.app.service;

import com.example.app.entity.Student;
import com.example.app.entity.StudentRepository;
import com.example.app.entity.User;
import com.example.app.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentdao;

    @Override
    public List<Student> find_nodk() {
        List<Student> userList = new ArrayList();
        userList = studentdao.find_nodk();
        return userList;
    }

    @Override
    public String find_byid(Integer ids){
        String p;
        p=studentdao.find_byid(ids);
        return p;
    }
    @Override
    public String find_name(Integer ids){
        return studentdao.find_name(ids);
    }

    @Override
    public Student save(Student student) {
        Student s = studentdao.save(student);
        return s;
    }


    @Override
    public List<Student> find_id(String ids){
        List<Student> userList = new ArrayList();
        userList = studentdao.find_id(ids);
        return userList;
    }
    @Override
    public String findname_BYid(String ids){
        return studentdao.findname_BYid(ids);
    }
}
