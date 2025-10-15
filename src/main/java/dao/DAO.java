package dao;

import entities.Cliente;

import java.util.List;

public interface DAO<E, T> {
    void save(E obj);

    void update(E obj);

    void delete(T primaryKey);

    E getById(T primaryKey);

    List<E> getAll();
}
