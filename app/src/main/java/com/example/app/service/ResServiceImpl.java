package com.example.app.service;

import com.example.app.entity.Res;
import com.example.app.entity.ResRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResServiceImpl implements ResService{
    @Autowired
    ResRepository resdao;

    @Override
    public Res save(Res res) {
        Res r = resdao.save(res);
        return r;
    }

    @Override
    public List<Res> find_res() {
        List<Res> resList = resdao.find_res();
        return resList;
    }

    @Override
    public void del(Integer id) {
        resdao.deleteById(id);
    }

    @Override
    public Integer find_res_data() {
        Integer t = resdao.find_res_data();
        return t;
    }

}
