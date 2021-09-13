package com.example.app.entity;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ResRepository extends JpaRepository<Res, Integer> {
    @Query(value="select * from res", nativeQuery = true)
    public List<Res> find_res();

    @Query(value="select count(*) from res", nativeQuery = true)
    public Integer find_res_data();
}
