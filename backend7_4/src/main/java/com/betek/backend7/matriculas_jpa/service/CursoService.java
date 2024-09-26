package com.betek.backend7.matriculas_jpa.service;

import com.betek.backend7.matriculas_jpa.dto.CursoRequestDto;
import com.betek.backend7.matriculas_jpa.model.Curso;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CursoService {

    public Curso crearCurso(CursoRequestDto curso);

    public List<Curso> getCursos();
}
