package com.betek.backend7.matriculas_jpa.service;

import com.betek.backend7.matriculas_jpa.model.Estudiante;
import com.betek.backend7.matriculas_jpa.repository.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudiantesServiceImpl implements  EstudiantesService{

    private final EstudianteRepository repository;

    public EstudiantesServiceImpl(EstudianteRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<Estudiante> getEstudiantes() {
        return repository.findAll();
    }

    @Override
    public Estudiante crearEstudiante(Estudiante estudiante) {
        return repository.save(estudiante);
    }

    @Override
    public List<Estudiante> getEstudiantesPorNombre(String nombre) {
        return repository.findByNombre(nombre);
    }
}
