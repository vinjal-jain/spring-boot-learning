package com.vinjal.starting.entity;

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

    private String age;

    private Integer rollNumber;

    @OneToMany(mappedBy = "student")
    private List<Course> courses;

    public Student(String fullName, String age, Integer rollNumber, List<Course> courses) {
        this.fullName = fullName;
        this.age = age;
        this.rollNumber = rollNumber;
        this.courses = courses;
    }

}
