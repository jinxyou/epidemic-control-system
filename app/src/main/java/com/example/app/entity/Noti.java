package com.example.app.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name="noti")
public class Noti {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer no;

    @Column
    private String title;

    @Column
    private String content;
}
