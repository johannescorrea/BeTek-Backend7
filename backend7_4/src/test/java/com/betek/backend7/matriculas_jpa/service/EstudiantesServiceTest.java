package com.betek.backend7.matriculas_jpa.service;

import com.betek.backend7.matriculas_jpa.model.Estudiante;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
class EstudiantesServiceTest {

    @Autowired
    private EstudiantesService estudiantesService;

    @Test
    void getEstudiantes_shouldReturnNonEmptyList() {
        List<Estudiante> estudiantes = estudiantesService.getEstudiantes();
        assertFalse(estudiantes.isEmpty());
    }

    @Test
    void getEstudiantesPorNombre_shouldReturnValue() {
        List<Estudiante> estudiantes = estudiantesService.getEstudiantesPorNombre("Carlos");
        assertThat(estudiantes).isNotEmpty();
        assertThat(estudiantes).allMatch(estudiante -> estudiante.getNombre().equals("Carlos"));
    }

}