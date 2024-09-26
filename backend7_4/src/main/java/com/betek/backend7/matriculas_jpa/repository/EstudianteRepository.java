package com.betek.backend7.matriculas_jpa.repository;

import com.betek.backend7.matriculas_jpa.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {

    List<Estudiante> findByNombre(String nombre);
}
