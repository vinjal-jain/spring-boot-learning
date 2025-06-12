package com.vinjal.starting.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinjal.starting.dto.CourseDto;
import com.vinjal.starting.entity.Course;
import com.vinjal.starting.service.CourseService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
public class CourseController {
    
    private final CourseService courseService;

    @PostMapping
    public Course saveCourse(@RequestBody CourseDto courseDto){
        return courseService.saveCourse(courseDto.getName(), courseDto.getFees(), courseDto.getStudentId());
    }
}
