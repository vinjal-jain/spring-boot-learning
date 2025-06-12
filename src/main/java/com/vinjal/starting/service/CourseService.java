package com.vinjal.starting.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vinjal.starting.entity.Course;
import com.vinjal.starting.entity.Student;
import com.vinjal.starting.repo.CourseRepository;
import com.vinjal.starting.repo.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CourseService {
    
    private final CourseRepository courseRepository;
    private final StudentRepository studentRepository;

    // public void saveCourse(String name, int fees, long studentId){
    //     Optional<Student> student = studentRepository.findById(studentId);

    //     if (student.isEmpty()) {
    //         throw new RuntimeException("studetnt not found by student id: " + studentId);
    //     }

    //     Course course = new Course(name,fees); 
    //     course.setStudent(student.get());

    //     Course createdCourse = courseRepository.save(course);

    //     student.get().setCourses(List.of(createdCourse));

    //     studentRepository.save(student.get());
    // }

    public Course saveCourse(String name, int fees, long studentId) {
        Student student = studentRepository.findById(studentId)
            .orElseThrow(() -> new RuntimeException("studetnt not found by student id: " + studentId));

        Course course = new Course();
        course.setName(name);
        course.setFees(fees);
        course.setStudent(student);

        Course createdCourse = courseRepository.save(course);
        student.setCourses(List.of(createdCourse));

        // studentRepository.save(student);

        return createdCourse;
    }
}
