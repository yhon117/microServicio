package com.microservice.course.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudenDto {
    private String nombre;
    private String apellido;
    private String email;
    private Long courseId;

}
