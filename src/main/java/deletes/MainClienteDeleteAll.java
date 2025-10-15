package deletes;

import util.EMF;
import jakarta.persistence.EntityManager;

public class MainClienteDeleteAll {
    public static void main(String[] args) {

        try(EntityManager em = EMF.getEntityManager()){

            em.getTransaction().begin();
            em.createQuery("delete from Cliente").executeUpdate();
            em.getTransaction().commit();
            em.clear();
        }
    }
}
