package com.vinjal.starting.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinjal.starting.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
