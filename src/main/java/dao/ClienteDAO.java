package dao;

import entities.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import util.EMF;

import java.util.List;

// Esta linha já estava correta!
public class ClienteDAO implements DAO<Cliente, Integer> {

    @Override
    public void save(Cliente obj) { // CORREÇÃO: E -> Cliente
        try (EntityManager em = EMF.getEntityManager()) {
            em.getTransaction().begin();
            em.persist(obj);
            em.flush();
            em.getTransaction().commit();
        }
    }

    @Override
    public void update(Cliente obj) { // CORREÇÃO: E -> Cliente
        try (EntityManager em = EMF.getEntityManager()) {
            em.getTransaction().begin();
            em.merge(obj);
            em.flush();
            em.getTransaction().commit();
        }
    }

    @Override
    public void delete(Integer primaryKey) { // CORREÇÃO: int -> Integer (o tipo T)
        try (EntityManager em = EMF.getEntityManager()) {
            em.getTransaction().begin();
            Cliente objeto = em.find(Cliente.class, primaryKey);
            if (objeto != null) { // Boa prática: verificar se o objeto existe antes de remover
                em.remove(objeto);
            }
            em.getTransaction().commit();
        }
    }

    @Override
    public Cliente getById(Integer primaryKey) { // CORREÇÃO: int -> Integer (o tipo T)
        try (EntityManager em = EMF.getEntityManager()) {
            // getById não precisa de transação para uma simples leitura
            Cliente cliente = em.find(Cliente.class, primaryKey);
            if (cliente != null) {
                System.out.println(cliente.getNome());
            }
            return cliente;
        }
    }

    @Override
    public List<Cliente> getAll() { // Este método já estava correto!
        try (EntityManager em = EMF.getEntityManager()) {
            // Leituras também não precisam de begin/commit de transação
            TypedQuery<Cliente> query = em.createQuery("select c from Cliente c", Cliente.class);
            List<Cliente> lista = query.getResultList();

            lista.forEach(e -> {
                System.out.println(e.getNome());
            });
            return lista;
        }
    }
}