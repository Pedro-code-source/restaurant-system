package saves;

import util.EMF;
import entities.Pedido;
import jakarta.persistence.EntityManager;

public class MainPedidoSave {
    public static void main(String[] args) {

        try(EntityManager em = EMF.getEntityManager()){

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
