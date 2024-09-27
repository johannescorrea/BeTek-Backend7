package com.betek.backend7.matriculas_jpa.service;

import com.betek.backend7.matriculas_jpa.model.Profesor;

import java.util.List;

public interface ProfesorService {

    List<Profesor> buscarPorEspecialidad(String especialidad);
}
