package br.edu.ifpb.es.daw.Atividade1.Mains.Save;

import br.edu.ifpb.es.daw.entities.Garcom;
import util.EMF;
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