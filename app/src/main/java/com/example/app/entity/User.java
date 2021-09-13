package com.example.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@Entity
@Table(name="jkdk")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer no;

    @Column
    private String id;

    @Column
    private String name;

    @Column
    private String fr;

    @Column
    private String city;

    @Column
    private String sex;

    @Column
    private float tw;

    @Column
    private String info;

}
