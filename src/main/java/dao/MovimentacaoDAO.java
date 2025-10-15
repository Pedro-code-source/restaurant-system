package dao;

import entities.MovimentacaoDeEstoque;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import util.EMF;

import java.util.List;

public class MovimentacaoDAO implements DAO<MovimentacaoDeEstoque, Integer> {
    @Override
    public void save(MovimentacaoDeEstoque obj) {
        try (EntityManager em = EMF.getEntityManager()) {
            em.getTransaction().begin();
            em.persist(obj);
            em.flush();
            em.getTransaction().commit();
        }

    }

    @Override
    public void update(MovimentacaoDeEstoque obj) {
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
            MovimentacaoDeEstoque objeto = em.find(MovimentacaoDeEstoque.class, primaryKey);
            if (objeto != null) { // Boa prática: verificar se o objeto existe antes de remover
                em.remove(objeto);
            }
            em.getTransaction().commit();
        }

    }

    @Override
    public MovimentacaoDeEstoque getById(Integer primaryKey) {
        try (EntityManager em = EMF.getEntityManager()) {
            // getById não precisa de transação para uma simples leitura
            MovimentacaoDeEstoque movimentacaoDeEstoque = em.find(MovimentacaoDeEstoque.class, primaryKey);
            if (movimentacaoDeEstoque != null) {
                System.out.println(movimentacaoDeEstoque.getTipoDeMovimentacao());
            }
            return movimentacaoDeEstoque;
        }
    }

    @Override
    public List<MovimentacaoDeEstoque> getAll() {
        try (EntityManager em = EMF.getEntityManager()) {
            // Leituras também não precisam de begin/commit de transação
            TypedQuery<MovimentacaoDeEstoque> query = em.createQuery("select c from MovimentacaoDeEstoque c", MovimentacaoDeEstoque.class);
            List<MovimentacaoDeEstoque> lista = query.getResultList();

            lista.forEach(e -> {
                System.out.println(e.getTipoDeMovimentacao());
            });
            return lista;
        }
    }
}
