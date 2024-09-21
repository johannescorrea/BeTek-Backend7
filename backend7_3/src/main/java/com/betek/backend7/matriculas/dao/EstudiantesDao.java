package com.betek.backend7.matriculas.dao;

import com.betek.backend7.matriculas.model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EstudiantesDao implements GenericDAO<Estudiante, Long> {

    private final Connection jdbcConnection;

    @Autowired
    public EstudiantesDao(Connection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    @Override
    public Estudiante getById(Long id) {
        return null;
    }

    @Override
    public List<Estudiante> getAll() {
        List<Estudiante> estudiantes = new ArrayList<>();
        String query = "SELECT * FROM Estudiante";
        try (Statement statement = jdbcConnection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                estudiantes.add(new Estudiante(resultSet.getInt("idEstudiante"),
                        resultSet.getString("nombre"),
                        resultSet.getString("apellido"),
                        resultSet.getString("fechaNacimiento"),
                        resultSet.getString("direccion")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return estudiantes;
    }

    @Override
    public void save(Estudiante entity) {

    }

    @Override
    public void update(Estudiante entity) {

    }

    @Override
    public void delete(Long id) {

    }
}
