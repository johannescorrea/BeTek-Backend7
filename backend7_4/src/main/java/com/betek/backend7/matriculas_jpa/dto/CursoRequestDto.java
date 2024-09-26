package com.betek.backend7.matriculas_jpa.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CursoRequestDto {

    private String nombre;
    private Integer duracion;
    private Integer idProfesor;
}
