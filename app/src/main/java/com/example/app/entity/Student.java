package com.example.app.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="student")
public class Student {
    @Id
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private String password;

    @Column
    private String faculty;
}
