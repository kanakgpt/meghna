package com.intuit.hello_world.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "student")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "s_name")
    private String name;
    @Column(name = "email")
    private String email;
    @Column(name = "course")
    private String course;
    @Column(name = "age")
    private String age;
    @Column(name = "address")
    private String address;


}
