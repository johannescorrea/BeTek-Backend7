package com.betek.backend7.matriculas_jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "ESTUDIANTE")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estudiante_seq")
    @Column(name = "IDESTUDIANTE")
    private Integer idEstudiante;

    @Column(name = "NOMBRE", length = 100, nullable = false)
    private String nombre;

    @Column(name = "APELLIDO", length = 100, nullable = false)
    private String apellido;

    @Column(name = "FECHANACIMIENTO")
    private LocalDate fechaNacimiento;

    @Column(name = "DIRECCION", length = 200)
    private String direccion;

    public Estudiante() {
    }

    public Estudiante(Integer idEstudiante, String nombre, String apellido, LocalDate fechaNacimiento, String direccion) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }
}
