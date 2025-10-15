package dao;

import entities.Cliente;
import entities.Reserva;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import util.EMF;

import java.util.List;

public class ReservaDAO implements DAO<Reserva , Integer>{
    @Override
    public void save(Reserva obj) {
        try (EntityManager em = EMF.getEntityManager()) {
            em.getTransaction().begin();
            em.persist(obj);
            em.flush();
            em.getTransaction().commit();
        }

    }

    @Override
    public void update(Reserva obj) {
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
            Reserva objeto = em.find(Reserva.class, primaryKey);
            if (objeto != null) {
                em.remove(objeto);
            }
            em.getTransaction().commit();
        }

    }

    @Override
    public Reserva getById(Integer primaryKey) {
        try (EntityManager em = EMF.getEntityManager()) {

            Reserva reserva = em.find(Reserva.class, primaryKey);
            if (reserva != null) {
                System.out.println(reserva.getDataEHora());
            }
            return reserva;
        }
    }

    @Override
    public List<Reserva> getAll() {
        try (EntityManager em = EMF.getEntityManager()) {

            TypedQuery<Reserva> query = em.createQuery("select c from Reserva c", Reserva.class);
            List<Reserva> lista = query.getResultList();

            lista.forEach(e -> {
                System.out.println(e.getDataEHora());
            });
            return lista;
        }
    }
}
