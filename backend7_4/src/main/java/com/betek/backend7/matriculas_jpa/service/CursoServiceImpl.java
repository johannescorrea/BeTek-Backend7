package com.betek.backend7.matriculas_jpa.service;

import com.betek.backend7.matriculas_jpa.dto.CursoRequestDto;
import com.betek.backend7.matriculas_jpa.model.Curso;
import com.betek.backend7.matriculas_jpa.model.Profesor;
import com.betek.backend7.matriculas_jpa.repository.CursoRepository;
import com.betek.backend7.matriculas_jpa.repository.ProfesorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CursoServiceImpl implements CursoService {

    private final CursoRepository cursoRepository;
    private final ProfesorRepository profesorRepository;

    @Override
    public Curso crearCurso(CursoRequestDto curso) {

        Profesor profesor = profesorRepository.findById(curso.getIdProfesor()).orElseThrow(() -> new RuntimeException("Profesor no encontrado"));

        Curso cursoCreado = new Curso();
        cursoCreado.setNombre(curso.getNombre());
        cursoCreado.setDuracion(curso.getDuracion());
        cursoCreado.setProfesor(profesor);
        return cursoRepository.save(cursoCreado);
    }

    @Override
    @Transactional
    public List<Curso> getCursos() {
        return cursoRepository.findAll();
    }
}
