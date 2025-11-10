package br.edu.ifpb.es.daw.dao;

import br.edu.ifpb.es.daw.entities.Cliente;

import java.util.List;

public interface DAO<E, T> {

    void save(E obj) throws PersistenciaDawException;

    E update(E obj) throws PersistenciaDawException;

    void delete(T primaryKey) throws PersistenciaDawException;

    E getByID(T primaryKey) throws PersistenciaDawException;

    List<E> getAll() throws PersistenciaDawException;
}
