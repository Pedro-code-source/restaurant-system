package dao;

import entities.Entrega;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import util.EMF;

import java.util.List;

public class EntregaDAO implements DAO<Entrega, Integer> {

    @Override
    public void save(Entrega obj) {
        try(EntityManager em = EMF.getEntityManager()){
            em.getTransaction().begin();
            em.persist(obj);
            em.flush();
            em.getTransaction().commit();
        }
    }

    @Override
    public void update(Entrega obj) {
        try(EntityManager em = EMF.getEntityManager()){
            em.getTransaction().begin();
            em.merge(obj);
            em.flush();
            em.getTransaction().commit();
        }
    }

    @Override
    public void delete(Integer primaryKey) {
        try (EntityManager em = EMF.getEntityManager()){
            em.getTransaction().begin();
            Entrega objeto = em.find(Entrega.class, primaryKey);
            em.remove(objeto);
            em.getTransaction().commit();
        }
    }

    @Override
    public Entrega getById(Integer primaryKey) {
        try(EntityManager em = EMF.getEntityManager()){
            em.getTransaction().begin();
            Entrega entrega = em.find(Entrega.class, primaryKey);
            em.getTransaction().commit();
            System.out.println(entrega.getNome());
            return entrega;
        }
    }

    @Override
    public List<Entrega> getAll() {
        try(EntityManager em = EMF.getEntityManager()){
            em.getTransaction().begin();
            TypedQuery<Entrega> query = em.createQuery("select e from Entrega e", Entrega.class);
            em.getTransaction().commit();
            List<Entrega> lista = query.getResultList();

            lista.forEach(e-> {
                System.out.println(e.getNome());
            });

            return lista;
        }
    }
}
