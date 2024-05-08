package com.microservice.student.service;

import com.microservice.student.entitys.Student;
import com.microservice.student.persisten.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudenServiceImpl implements IstudenService{

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> finadAll() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Student student) {

        studentRepository.save(student);
    }

    @Override
    public List<Student> findByIdCourse(Long idCourse) {
        return studentRepository.findAllByCourseId(idCourse);
    }
}
