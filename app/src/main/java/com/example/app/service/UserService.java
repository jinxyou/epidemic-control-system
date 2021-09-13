package com.example.app.service;

import com.example.app.entity.Student;
import com.example.app.entity.User;

import java.util.List;

public interface UserService {
    User save(User user);

    List<User> findAll();

    List<User> findabn();

    Integer findabn_data();

    Integer find_today_data();

    Integer find_nodk_data();

    List<User> find_info();




}
