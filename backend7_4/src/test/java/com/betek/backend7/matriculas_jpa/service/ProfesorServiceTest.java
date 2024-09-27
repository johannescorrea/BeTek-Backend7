package com.betek.backend7.matriculas_jpa.service;

import com.betek.backend7.matriculas_jpa.model.Profesor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
class ProfesorServiceTest {

    @Autowired
    private ProfesorService profesorService;

    @Test
    void buscarPorEspecialidad_shouldReturnValues() {
        List<Profesor> profesores = profesorService.buscarPorEspecialidad("Desarrollo");
        assertThat(profesores).isNotEmpty();
        assertThat(profesores).allMatch(profesor -> profesor.getEspecialidad().contains("Desarrollo"));
    }

}