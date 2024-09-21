package com.betek.backend7.matriculas.repository.jdbc;

import com.betek.backend7.matriculas.model.Estudiante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EstudianteRepository extends CrudRepository<Estudiante, Integer> {

    List<Estudiante> findByNombre(String nombre);  //SELECT * FROM Estudiante WHERE nombre = ?
    List<Estudiante> findByApellido(String apellido);
    Optional<Estudiante> findByNombreAndApellido(String nombre, String apellido);
    List<Estudiante> findByFechaNacimiento(String fechaNacimiento);
    List<Estudiante> findByDireccion(String direccion);

}
