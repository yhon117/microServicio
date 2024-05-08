package com.microservice.student.service;

import com.microservice.student.entitys.Student;

import java.util.List;

public interface IstudenService {
    List<Student> finadAll();

    Student findById(Long id);

    void save (Student student);

    List<Student> findByIdCourse(Long idCourse);
}
