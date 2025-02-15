package com.betek.backend7.matriculas_jpa.controller;

import com.betek.backend7.matriculas_jpa.model.Profesor;
import com.betek.backend7.matriculas_jpa.repository.ProfesorRepository;
import com.betek.backend7.matriculas_jpa.service.ProfesorService;
import jakarta.persistence.ManyToOne;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/profesores")
@RequiredArgsConstructor
public class ProfesorController {

    private final ProfesorRepository profesorRepository;
    private final ProfesorService profesorService;

    @GetMapping
    public ResponseEntity<List<Profesor>> getProfesores() {
        return ResponseEntity.ok(profesorRepository.findAll());
    }

    @GetMapping(params = {"especialidad"})
    public ResponseEntity<List<Profesor>> getProfesoresByEspecialidad(@RequestParam("especialidad") String nombre) {
        return ResponseEntity.ok(profesorService.buscarPorEspecialidad(nombre));
    }

    @PostMapping
    public ResponseEntity<Profesor> crearProfesor(@RequestBody Profesor profesor) {
        Profesor profesorCreado = this.profesorRepository.save(profesor);
        return new ResponseEntity<>(profesorCreado, HttpStatus.CREATED);
    }
}
