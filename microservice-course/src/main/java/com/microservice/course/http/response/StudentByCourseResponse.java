package com.microservice.course.http.response;

import com.microservice.course.dto.StudenDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentByCourseResponse {

    private String nombreCurso;
    private String profesor;
    private List<StudenDto> studenDtoList;

}
