package com.example.app.service;

import com.example.app.entity.Noti;
import org.springframework.stereotype.Service;

import java.util.List;


public interface NotiService {
    Noti save(Noti noti);
    List<Noti> find_noti();
}
