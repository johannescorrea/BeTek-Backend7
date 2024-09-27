package com.betek.backend7.matriculas_jpa.service;

import com.betek.backend7.matriculas_jpa.model.Profesor;
import com.betek.backend7.matriculas_jpa.repository.ProfesorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfesorServiceImpl implements ProfesorService {


    private final ProfesorRepository profesorRepository;

    @Override
    public List<Profesor> buscarPorEspecialidad(String especialidad) {
        return profesorRepository.findByEspecialidadContainingIgnoreCase(especialidad);
    }
}
