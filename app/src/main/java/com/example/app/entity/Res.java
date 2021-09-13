package com.example.app.entity;

import lombok.Data;
import org.hibernate.annotations.CollectionId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="res")
public class Res {

    @Id
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer mask;

    @Column
    private Integer alcohol;

    @Column
    private Integer meter;

    @Column
    private String other;


}
