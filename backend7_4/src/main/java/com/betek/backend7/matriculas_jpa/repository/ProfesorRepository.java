package com.betek.backend7.matriculas_jpa.repository;

import com.betek.backend7.matriculas_jpa.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {
}
