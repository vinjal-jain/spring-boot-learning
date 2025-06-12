package com.vinjal.starting.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
// @Getter
// @Setter
@Data
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private Byte age;

    private Integer rollNumber;

    @OneToMany(mappedBy = "student")
    private List<Course> courses;

    public Student(String fullName, Byte age) {
        this.fullName = fullName;
        this.age = age;
        this.rollNumber = (int) Math.floor(Math.random() * 10000);
        this.courses = new ArrayList<>();
    }

}
