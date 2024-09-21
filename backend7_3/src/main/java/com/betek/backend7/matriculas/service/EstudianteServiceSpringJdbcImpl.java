package com.betek.backend7.matriculas.service;

import com.betek.backend7.matriculas.model.Estudiante;
import com.betek.backend7.matriculas.repository.jdbc.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceSpringJdbcImpl implements EstudiantesService {

    private final EstudianteRepository estudianteRepository;

    @Autowired
    public EstudianteServiceSpringJdbcImpl(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public List<Estudiante> getEstudiantes() {
        return (List<Estudiante>) estudianteRepository.findAll();
    }
}
