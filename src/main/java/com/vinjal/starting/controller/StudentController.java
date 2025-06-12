package com.vinjal.starting.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinjal.starting.entity.Student;
import com.vinjal.starting.service.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("students")
@RequiredArgsConstructor
public class StudentController {
    
    private final StudentService studentService;


    // /students
    @GetMapping
    public List<Student> getAllStudetns(){
        return studentService.getAllStudents();
    }


}
