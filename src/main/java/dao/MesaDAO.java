package dao;

import entities.Mesa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import util.EMF;

import java.util.List;

public class MesaDAO implements DAO<Mesa, Integer> {
    @Override
    public void save(Mesa obj) {
        try (EntityManager em = EMF.getEntityManager()) {
            em.getTransaction().begin();
            em.persist(obj);
            em.flush();
            em.getTransaction().commit();
        }
    }

    @Override
    public void update(Mesa obj) {
        try (EntityManager em = EMF.getEntityManager()) {
            em.getTransaction().begin();
            em.merge(obj);
            em.flush();
            em.getTransaction().commit();
        }

    }

    @Override
    public void delete(Integer primaryKey) {
        try (EntityManager em = EMF.getEntityManager()) {
            em.getTransaction().begin();
            Mesa objeto = em.find(Mesa.class, primaryKey);
            if (objeto != null) {
                em.remove(objeto);
            }
            em.getTransaction().commit();
        }

    }


    @Override
    public Mesa getById(Integer primaryKey) {
            try (EntityManager em = EMF.getEntityManager()){
                Mesa mesa = em.find(Mesa.class, primaryKey);
                if (mesa != null) {
                    System.out.println(mesa.getNumero());
                }
                return mesa;
            }
    }



    @Override
    public List<Mesa> getAll() {
        try (EntityManager em = EMF.getEntityManager()) {

            TypedQuery<Mesa> query = em.createQuery("select c from Mesa c", Mesa.class);
            List<Mesa> lista = query.getResultList();

            lista.forEach(e -> {
                System.out.println(e.getNumero());
            });
            return lista;
        }

    }
}
