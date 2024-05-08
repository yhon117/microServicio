package com.microservice.course.service;

import com.microservice.course.entitys.Course;
import com.microservice.course.http.response.StudentByCourseResponse;

import java.util.List;

public interface ICourseService {
    List<Course> fiandAll();

    Course findById(Long id);

    void save(Course course);

    StudentByCourseResponse findStudentByIdCourse(Long idCourse);

}
