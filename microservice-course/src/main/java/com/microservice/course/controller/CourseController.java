package com.microservice.course.controller;

import com.microservice.course.entitys.Course;
import com.microservice.course.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/course")
public class CourseController {
    @Autowired
    private ICourseService courseService;


    @PostMapping("/create")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void save(@RequestBody Course course){
        courseService.save(course);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllCourse(){
        return ResponseEntity.ok(courseService.fiandAll());
    }

    @GetMapping("/lista/{id}")
    public ResponseEntity<?>findById(@PathVariable Long id){

        return ResponseEntity.ok(courseService.findById(id));
    }

    @GetMapping("lista-studen/{idCourse}")
    public ResponseEntity<?> findStudenByIdCourse(@PathVariable Long idCourse){
        return ResponseEntity.ok(courseService.findStudentByIdCourse(idCourse));
    }
}
