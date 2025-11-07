package br.edu.ifpb.es.daw.Atividade1.Mains.Save;

import br.edu.ifpb.es.daw.entities.MovimentacaoDeEstoque;
import jakarta.persistence.EntityManager;

import java.util.Date;

public class MainMovimentacaoSave {
    public static void main(String[] args) {

        try(EntityManager em = EMF.getEntityManager()){

            em.getTransaction().begin();
            MovimentacaoDeEstoque movimentacaoDeEstoque = new MovimentacaoDeEstoque();
            movimentacaoDeEstoque.setDataCriacao(new Date());
            movimentacaoDeEstoque.setTipoDeMovimentacao("adição");
            movimentacaoDeEstoque.setQuantidade(250);
            em.persist(movimentacaoDeEstoque);
            em.getTransaction().commit();
        }
    }
}