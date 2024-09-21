package com.betek.backend7.matriculas.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table("ESTUDIANTE")
public class Estudiante {

    @Id
    @Column("IDESTUDIANTE")
    private Integer idEstudiante;
    private String nombre;
    private String apellido;

    @Column("FECHANACIMIENTO")
    private String fechaNacimiento;
    private String direccion;

    public Estudiante(Integer idEstudiante, String nombre, String apellido, String fechaNacimiento, String direccion) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }


}
