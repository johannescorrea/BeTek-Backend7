package com.betek.backend7.matriculas_jpa.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CursoResponseDto {

    private String nombre;
    private Integer duracion;
    private String profesor;
}
