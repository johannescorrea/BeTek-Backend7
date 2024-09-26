package com.betek.backend7.matriculas_jpa.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CURSOS")
public class Curso {

    @Id
    @Column(name = "IDCURSOS")
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.SEQUENCE, generator = "curso_seq")
    private Integer idCurso;

    @Column(name = "NOMBRECURSO", length = 50)
    private String nombre;

    @Column(name = "DURACIONCURSO")
    private Integer duracion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDPROFESOR")
    private Profesor profesor;
}
