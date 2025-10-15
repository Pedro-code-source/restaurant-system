package saves;

import util.EMF;
import entities.Garcom;
import jakarta.persistence.EntityManager;

public class MainGarcomSave {
    public static void main(String[] args) {

        try(EntityManager em = EMF.getEntityManager()){

            em.getTransaction().begin();
            Garcom garcom = new Garcom();
            garcom.setNome("Otávio");
            em.persist(garcom);
            em.getTransaction().commit();
        }
    }
}
