package com.vinjal.starting.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vinjal.starting.entity.Student;
import com.vinjal.starting.repo.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {
    
    private final StudentRepository studentRepository;

    // public StudentService(StudentRepository studentRepository){
    //     this.studentRepository = studentRepository;
    // }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
