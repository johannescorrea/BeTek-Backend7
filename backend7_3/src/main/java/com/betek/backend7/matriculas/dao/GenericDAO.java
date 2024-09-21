package com.betek.backend7.matriculas.dao;

import java.util.List;

public interface GenericDAO<T, ID> {
    T getById(ID id);
    List<T> getAll();
    void save(T entity);
    void update(T entity);
    void delete(ID id);
}
