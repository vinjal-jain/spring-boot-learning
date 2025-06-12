package com.vinjal.starting.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinjal.starting.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{
    
}
