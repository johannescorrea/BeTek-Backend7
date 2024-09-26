package com.betek.backend7.matriculas_jpa.controller;

import com.betek.backend7.matriculas_jpa.model.Estudiante;
import com.betek.backend7.matriculas_jpa.service.EstudiantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/estudiantes")
public class EstudiantesController {

    private final EstudiantesService estudiantesService;

    @Autowired
    public EstudiantesController(EstudiantesService estudiantesService) {
        this.estudiantesService = estudiantesService;
    }


    @GetMapping
    public ResponseEntity<List<Estudiante>> getEstudiantes() {
        return ResponseEntity.ok(estudiantesService.getEstudiantes());
    }

    @GetMapping(params = {"nombre"})
    public ResponseEntity<List<Estudiante>> getEstudiantesPorNombre(@RequestParam("nombre") String nombre) {
        return ResponseEntity.ok(estudiantesService.getEstudiantesPorNombre(nombre));
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Estudiante> crearEstudiante(@RequestBody Estudiante estudiante) {
        Estudiante estudianteCreado = this.estudiantesService.crearEstudiante(estudiante);
        return new ResponseEntity<>(estudianteCreado, HttpStatus.CREATED);
    }
}
