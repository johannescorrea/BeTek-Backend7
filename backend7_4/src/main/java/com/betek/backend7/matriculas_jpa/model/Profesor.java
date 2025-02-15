package com.betek.backend7.matriculas_jpa.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PROFESORES")
public class Profesor {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "IDPROFESOR")
    private Integer idProfesor;

    @Column(name = "NOMBREPROFESOR", length = 50)
    private String nombre;

    @Column(name = "APELLIDOPROFESOR", length = 50)
    private String apellido;

    @Column(name = "ESPECIALIDAD", length = 50)
    private String especialidad;

    @OneToMany(mappedBy = "profesor", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Curso> cursos;
}
