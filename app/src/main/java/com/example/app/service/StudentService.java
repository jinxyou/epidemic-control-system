package com.example.app.service;

import com.example.app.entity.Student;
import com.example.app.entity.User;

import java.util.List;

public interface StudentService {
    List<Student> find_nodk();

    String find_byid(Integer ids);

    String find_name(Integer ids);

    Student save(Student student);

    List<Student> find_id(String ids);

    public String findname_BYid(String ids);

}
