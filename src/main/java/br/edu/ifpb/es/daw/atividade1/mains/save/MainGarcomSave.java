package br.edu.ifpb.es.daw.atividade1.mains.save;

import br.edu.ifpb.es.daw.entities.Garcom;
import br.edu.ifpb.es.daw.util.JPAUtil;
import jakarta.persistence.EntityManager;

public class MainGarcomSave {
    public static void main(String[] args) {

        try(EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager()){

            em.getTransaction().begin();
            Garcom garcom = new Garcom();
            garcom.setNome("Otávio");
            em.persist(garcom);
            em.getTransaction().commit();
        }
    }
}