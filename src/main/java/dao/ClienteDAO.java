package dao;

import entities.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import util.EMF;

import java.util.List;


public class ClienteDAO implements DAO<Cliente, Integer> {

    @Override
    public void save(Cliente obj) {
        try (EntityManager em = EMF.getEntityManager()) {
            em.getTransaction().begin();
            em.persist(obj);
            em.flush();
            em.getTransaction().commit();
        }
    }

    @Override
    public void update(Cliente obj) {
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
            Cliente objeto = em.find(Cliente.class, primaryKey);
            if (objeto != null) {
                em.remove(objeto);
            }
            em.getTransaction().commit();
        }
    }

    @Override
    public Cliente getById(Integer primaryKey) {
        try (EntityManager em = EMF.getEntityManager()) {

            Cliente cliente = em.find(Cliente.class, primaryKey);
            if (cliente != null) {
                System.out.println(cliente.getNome());
            }
            return cliente;
        }
    }

    @Override
    public List<Cliente> getAll() {
        try (EntityManager em = EMF.getEntityManager()) {

            TypedQuery<Cliente> query = em.createQuery("select c from Cliente c", Cliente.class);
            List<Cliente> lista = query.getResultList();

            lista.forEach(e -> {
                System.out.println(e.getNome());
            });
            return lista;
        }
    }
}