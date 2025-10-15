package saves;

import util.EMF;
import entities.Mesa;
import jakarta.persistence.EntityManager;

public class MainMesaSave {
    public static void main(String[] args) {

        try(EntityManager em = EMF.getEntityManager()){

            em.getTransaction().begin();
            Mesa mesa = new Mesa();
            mesa.setCapacidade(4);
            mesa.setNumero(12);
            mesa.setStatus("disponível");
            em.persist(mesa);
            em.getTransaction().commit();
        }
    }
}
