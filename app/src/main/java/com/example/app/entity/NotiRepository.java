package com.example.app.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NotiRepository extends JpaRepository<Noti, Integer> {
    @Query(value = "select * from noti", nativeQuery = true)
    public List<Noti> find_noti();
}
