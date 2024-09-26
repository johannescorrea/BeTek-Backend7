package com.betek.backend7.matriculas_jpa.service;

import com.betek.backend7.matriculas_jpa.model.Estudiante;

import java.util.List;

public interface EstudiantesService {

    List<Estudiante> getEstudiantes();

    Estudiante crearEstudiante(Estudiante estudiante);

    List<Estudiante> getEstudiantesPorNombre(String nombre);
}
