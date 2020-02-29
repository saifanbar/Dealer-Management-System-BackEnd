package com.saifanbar.dmsapp.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="cars_main")
@Getter
@Setter
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "year")
    private int year;
    @Column(name = "make")
    private String make;
    @Column(name = "model")
    private String model;
    @Column(name = "color")
    private String color;
    @Column(name = "vin")
    private String vin;
    @Column(name = "status")
    private String status;
    @Column(name = "photo_path")
    private String photo_path;



}
