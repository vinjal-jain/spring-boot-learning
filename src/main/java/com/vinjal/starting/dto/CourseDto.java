package com.vinjal.starting.dto;

import lombok.Data;

@Data
public class CourseDto {
    private Long id;

    private String name;

    private Integer fees;

    private Long studentId;

    public CourseDto(String name, Integer fees, Long studentId) {
        this.name = name;
        this.fees = fees;
        this.studentId = studentId;
    }

}
