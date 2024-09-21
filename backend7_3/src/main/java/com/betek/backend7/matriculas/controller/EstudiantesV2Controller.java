package com.betek.backend7.matriculas.controller;

import com.betek.backend7.matriculas.model.Estudiante;
import com.betek.backend7.matriculas.service.EstudiantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v2/estudiantes")
public class EstudiantesV2Controller {

    private final EstudiantesService estudiantesService;

    @Autowired
    public EstudiantesV2Controller(@Qualifier("estudianteServiceSpringJdbcImpl") EstudiantesService estudiantesService) {
        this.estudiantesService = estudiantesService;
    }


    @GetMapping
    public ResponseEntity<List<Estudiante>> getEstudiantes() {
        return ResponseEntity.ok(estudiantesService.getEstudiantes());
    }
}
