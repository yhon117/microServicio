package com.microservice.course.client;

import com.microservice.course.dto.StudenDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-student",url = "localhost:8090/api/studen")
public interface StudentClient {

    @GetMapping("/buscar-course/{idCourse}")
    List<StudenDto> fianAllStudentByCourse(@PathVariable Long idCourse);
}
