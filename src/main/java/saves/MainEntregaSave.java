package saves;

import util.EMF;
import entities.Entrega;
import jakarta.persistence.EntityManager;

public class MainEntregaSave {
    public static void main(String[] args) {
        try(EntityManager em = EMF.getEntityManager();){


            em.getTransaction().begin();
            Entrega entrega = new Entrega();
            entrega.setNome("João");
            entrega.setTelefone(987675643);
            em.persist(entrega);
            em.getTransaction().commit();

        }

    }
}
