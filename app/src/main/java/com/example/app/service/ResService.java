package com.example.app.service;

import com.example.app.entity.Res;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ResService {
    Res save(Res res);
    List<Res> find_res();
    void del(Integer id);
    Integer find_res_data();
}
