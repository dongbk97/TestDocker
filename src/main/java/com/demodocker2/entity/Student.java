package com.demodocker2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "st_id", nullable = false)
    private int id;
    @Column(name = "st_age", nullable=false)
    private int age;
    @Column(name = "st_name", nullable=false)
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
