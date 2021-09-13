package com.example.app.service;

import com.example.app.entity.Noti;
import com.example.app.entity.NotiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotiServiceImpl implements NotiService{
    @Autowired
    NotiRepository Notidao;

    @Override
    public Noti save(Noti noti) {
        Noti r = Notidao.save(noti);
        return r;
    }

    @Override
    public List<Noti> find_noti() {
        List<Noti> notiList = Notidao.find_noti();
        return notiList;
    }
}
