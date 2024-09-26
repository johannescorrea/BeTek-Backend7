package com.betek.backend7.matriculas_jpa.repository;

import com.betek.backend7.matriculas_jpa.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
