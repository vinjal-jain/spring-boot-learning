package com.vinjal.starting.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
// @Getter
// @Setter
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer fees;

    public Course(String name, Integer fees, Student student) {
        this.name = name;
        this.fees = fees;
        this.student = student;
    }

    @ManyToOne
    private Student student;
    
}
