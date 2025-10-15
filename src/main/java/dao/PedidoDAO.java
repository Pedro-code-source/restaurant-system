package dao;

import entities.Cliente;
import entities.Pedido;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import util.EMF;

import java.util.List;

public class PedidoDAO implements DAO<Pedido, Integer>{
    @Override
    public void save(Pedido obj) {
        try (EntityManager em = EMF.getEntityManager()) {
            em.getTransaction().begin();
            em.persist(obj);
            em.flush();
            em.getTransaction().commit();
        }

    }

    @Override
    public void update(Pedido obj) {
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
            Pedido objeto = em.find(Pedido.class, primaryKey);
            if (objeto != null) { // Boa prática: verificar se o objeto existe antes de remover
                em.remove(objeto);
            }
            em.getTransaction().commit();

        }
    }

    @Override
    public Pedido getById(Integer primaryKey) {
        try (EntityManager em = EMF.getEntityManager()) {
            // getById não precisa de transação para uma simples leitura
            Pedido pedido = em.find(Pedido.class, primaryKey);
            if (pedido != null) {
                System.out.println(pedido.getStatus());
            }
            return pedido;
        }
    }

    @Override
    public List<Pedido> getAll() {
        try (EntityManager em = EMF.getEntityManager()) {
            // Leituras também não precisam de begin/commit de transação
            TypedQuery<Pedido> query = em.createQuery("select c from Cliente c", Pedido.class);
            List<Pedido> lista = query.getResultList();

            lista.forEach(e -> {
                System.out.println(e.getStatus());
            });
            return lista;
        }
    }
}
