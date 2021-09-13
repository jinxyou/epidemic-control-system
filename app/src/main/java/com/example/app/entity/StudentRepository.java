package com.example.app.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query(value="select * from student where id not in (select id from jkdk where DATE(date)=current_date)", nativeQuery = true)
    public List<Student> find_nodk();

    @Query(value = "select password from student where (id=?1)",nativeQuery = true)
    public String find_byid(Integer ids);
    @Query(value = "select name from student where (id=?1)",nativeQuery = true)
    public String find_name(Integer ids);

    @Query(value = "select * from student where (id= ?1)",nativeQuery = true)
    public List<Student> find_id(String ids);

    @Query(value = "select name from student where (id= ?1)",nativeQuery = true)
    public String findname_BYid(String ids);

}
