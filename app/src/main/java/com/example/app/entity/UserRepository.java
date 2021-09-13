package com.example.app.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value="select * from jkdk where DATE(date)=current_date", nativeQuery = true)
    public List<User> findAll();

    @Query(value="select * from jkdk where fr='y'", nativeQuery = true)
    public List<User> findabn();

    @Query(value="select count(*) from jkdk where fr='y'", nativeQuery = true)
    public Integer findabn_data();

    @Query(value="select count(*) from jkdk where DATE(date)=current_date", nativeQuery = true)
    public Integer find_today_data();

    @Query(value="select count(*) from student where id not in (select id from jkdk where DATE(date)=current_date)", nativeQuery = true)
    public Integer find_nodk_data();

    @Query(value="select * from jkdk where info is not null", nativeQuery = true)
    public List<User> find_info();


}
