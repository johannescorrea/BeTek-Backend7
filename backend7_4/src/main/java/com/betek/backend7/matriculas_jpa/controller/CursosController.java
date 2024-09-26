package com.betek.backend7.matriculas_jpa.controller;

import com.betek.backend7.matriculas_jpa.dto.CursoRequestDto;
import com.betek.backend7.matriculas_jpa.model.Curso;
import com.betek.backend7.matriculas_jpa.repository.CursoRepository;
import com.betek.backend7.matriculas_jpa.service.CursoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/cursos")
@RequiredArgsConstructor
public class CursosController {

    private final CursoService cursoService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Curso> crearCurso(@RequestBody CursoRequestDto curso) {
        Curso cursoCreado = this.cursoService.crearCurso(curso);
        return new ResponseEntity<>(cursoCreado, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Curso>> getCursos() {
        return ResponseEntity.ok(cursoService.getCursos());
    }

}
