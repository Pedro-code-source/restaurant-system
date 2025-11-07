package br.edu.ifpb.es.daw.Atividade1.Mains.Save;

import br.edu.ifpb.es.daw.entities.Pedido;
import br.edu.ifpb.es.daw.util.JPAUtil;
import jakarta.persistence.EntityManager;

public class MainPedidoSave {
    public static void main(String[] args) {

        try(EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager()){

            em.getTransaction().begin();

            Pedido pedido = new Pedido();
            pedido.setStatus("Em preparo");
            pedido.setFormaDePagamento("pix");
            pedido.setValorFinal(50);
            em.persist(pedido);
            em.getTransaction().commit();

        }
    }
}