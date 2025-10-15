package dao;

import entities.Garcom;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import util.EMF;

import java.util.List;

public class GarcomDAO implements DAO<Garcom, Integer> {

    @Override
    public void save(Garcom obj) {
        try (EntityManager em = EMF.getEntityManager()) {
            em.getTransaction().begin();
            em.persist(obj);
            em.flush();
            em.getTransaction().commit();
        }
    }

    @Override
    public void update(Garcom obj) {
        try (EntityManager em = EMF.getEntityManager()) {
            em.getTransaction().begin();
            em.merge(obj);
            em.flush();
            em.getTransaction().commit();
        }
    }

    @Override
    public void delete(Integer id) {
        try (EntityManager em = EMF.getEntityManager()) {
            em.getTransaction().begin();
            Garcom obj = em.find(Garcom.class, id);
            em.remove(obj);
            em.getTransaction().commit();
        }
    }

    @Override
    public Garcom getById(Integer id) {
        try (EntityManager em = EMF.getEntityManager()) {
            em.getTransaction().begin();
            Garcom garcom = em.find(Garcom.class, id);
            em.getTransaction().commit();
            System.out.println(garcom.getNome());
            return garcom;
        }
    }

    @Override
    public List<Garcom> getAll() {
        try (EntityManager em = EMF.getEntityManager()) {
            em.getTransaction().begin();
            TypedQuery<Garcom> query = em.createQuery("select g from Garcom g", Garcom.class);
            em.getTransaction().commit();
            List<Garcom> lista = query.getResultList();

            lista.forEach(g -> {
                System.out.println(g.getNome());
            });

            return lista;
        }
    }
}
