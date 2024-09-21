package com.betek.backend7.matriculas.service;

import com.betek.backend7.matriculas.dao.EstudiantesDao;
import com.betek.backend7.matriculas.model.Estudiante;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class EstudiantesServiceDaoImpl implements EstudiantesService {

    private final EstudiantesDao estudiantesDao;

    public EstudiantesServiceDaoImpl(EstudiantesDao estudiantesDao) {
        this.estudiantesDao = estudiantesDao;
    }

    @Override
    public List<Estudiante> getEstudiantes(){
        return estudiantesDao.getAll();
    }
}
