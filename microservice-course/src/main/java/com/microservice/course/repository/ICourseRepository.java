package com.microservice.course.repository;

import com.microservice.course.entitys.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepository extends CrudRepository<Course,Long> {

}
