package com.microservice.course.service;

import com.microservice.course.client.StudentClient;
import com.microservice.course.dto.StudenDto;
import com.microservice.course.entitys.Course;
import com.microservice.course.http.response.StudentByCourseResponse;
import com.microservice.course.repository.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements ICourseService{
    @Autowired
    private ICourseRepository service;

    @Autowired
    private StudentClient studentClient;

    @Override
    public List<Course> fiandAll() {
        return ((List<Course>) service.findAll());
    }

    @Override
    public Course findById(Long id) {
        return service.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {

        service.save(course);
    }

    @Override
    public StudentByCourseResponse findStudentByIdCourse(Long idCourse) {
        //Conultar el curso

        Course course = service.findById(idCourse).orElse(new Course());

        //obtener los estudiante

        List<StudenDto> studenDtoList= studentClient.fianAllStudentByCourse(idCourse);

        return StudentByCourseResponse.builder()
                .nombreCurso(course.getNombreCurso())
                .nombreCurso(course.getProfesor())
                .studenDtoList(studenDtoList)
                .build();
    }
}
