package dao;

import entities.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import util.EMF;

import java.util.List;

public class UsuarioDAO implements DAO<Usuario, Integer> {

    @Override
    public void save(Usuario obj) {
        try(EntityManager em = EMF.getEntityManager()) {
            em.getTransaction().begin();
            em.persist(obj);
            em.flush();
            em.getTransaction().commit();
        }
    }

    @Override
    public void update(Usuario obj) {
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
            Usuario objeto = em.find(Usuario.class, primaryKey);
            em.remove(objeto);
            em.getTransaction().commit();
        }
    }

    @Override
    public Usuario getById(Integer primaryKey) {
        try(EntityManager em = EMF.getEntityManager()) {
            em.getTransaction().begin();
            Usuario usuario = em.find(Usuario.class, primaryKey);
            em.getTransaction().commit();
            System.out.println(usuario.getEmail());
            return usuario;
        }
    }

    @Override
    public List<Usuario> getAll() {
        try(EntityManager em = EMF.getEntityManager()) {
            em.getTransaction().begin();
            TypedQuery<Usuario> query = em.createQuery("select i from Ingredientes i", Usuario.class);
            em.getTransaction().commit();
            List<Usuario> lista = query.getResultList();

            lista.forEach(e -> {
                System.out.println(e.getEmail());
            });

            return lista;
        }
    }
}
