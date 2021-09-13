package com.example.app.service;

import com.example.app.entity.Student;
import com.example.app.entity.User;
import com.example.app.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userdao;

    @Override
    public User save(User user) {
        User u = userdao.save(user);
        return u;
    }

    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList();
        userList = userdao.findAll();
        return userList;
    }

    @Override
    public List<User> findabn() {
        List<User> userList = new ArrayList();
        userList = userdao.findabn();
        return userList;
    }

    @Override
    public Integer findabn_data() {
        Integer t;
        t = userdao.findabn_data();
        return t;
    }

    @Override
    public Integer find_today_data() {
        Integer t;
        t = userdao.find_today_data();
        return t;
    }

    @Override
    public Integer find_nodk_data() {
        Integer t;
        t = userdao.find_nodk_data();
        return t;
    }

    @Override
    public List<User> find_info() {
        List<User> userList = new ArrayList();
        userList= userdao.find_info();
        return userList;
    }



}
