package deletes;

import util.EMF;
import jakarta.persistence.EntityManager;

public class MainPedidoDeleteAll {
    public static void main(String[] args) {

        try(EntityManager em = EMF.getEntityManager()){

            em.getTransaction().begin();
            em.createQuery("delete from Pedido").executeUpdate();
            em.getTransaction().commit();
            em.clear();
        }
    }
}
