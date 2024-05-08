package com.microservice.student.controller;

import com.microservice.student.entitys.Student;
import com.microservice.student.service.IstudenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/studen")
public class StudenController {
    @Autowired
    private IstudenService service;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Student student){
        service.save(student);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllStuden(){
        return ResponseEntity.ok(service.finadAll());
    }

    @GetMapping("/lista/{id}")
    public ResponseEntity<?>findById(@PathVariable Long id){

        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/buscar-course/{idCourse}")
    public ResponseEntity<?> findByIdCourse(@PathVariable Long idCourse){

        return  ResponseEntity.ok(service.findByIdCourse(idCourse));
    }
}
