package dao;

import entities.Ingredientes;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import util.EMF;

import java.util.List;

public class IngredientesDAO implements DAO<Ingredientes, Integer> {

    @Override
    public void save(Ingredientes obj) {
        try(EntityManager em = EMF.getEntityManager()) {
            em.getTransaction().begin();
            em.persist(obj);
            em.flush();
            em.getTransaction().commit();
        }
    }

    @Override
    public void update(Ingredientes obj) {
        try(EntityManager em = EMF.getEntityManager()) {
            em.getTransaction().begin();
            em.merge(obj);
            em.flush();
            em.getTransaction().commit();
        }
    }

    @Override
    public void delete(Integer primaryKey) {
        try(EntityManager em = EMF.getEntityManager()) {
            em.getTransaction().begin();
            Ingredientes objeto = em.find(Ingredientes.class, primaryKey);
            em.remove(objeto);
            em.getTransaction().commit();
        }
    }

    @Override
    public Ingredientes getById(Integer primaryKey) {
        try(EntityManager em = EMF.getEntityManager()) {
            em.getTransaction().begin();
            Ingredientes ingredientes = em.find(Ingredientes.class, primaryKey);
            em.getTransaction().commit();
            System.out.println(ingredientes.getNome());
            return ingredientes;
        }
    }

    @Override
    public List<Ingredientes> getAll() {
        try(EntityManager em = EMF.getEntityManager()) {
            em.getTransaction().begin();
            TypedQuery<Ingredientes> query = em.createQuery("select i from Ingredientes i", Ingredientes.class);
            em.getTransaction().commit();
            List<Ingredientes> lista = query.getResultList();

            lista.forEach(i -> {
                System.out.println(i.getNome());
            });

            return lista;
        }
    }
}
