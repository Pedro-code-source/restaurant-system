package br.edu.ifpb.es.daw.Atividade1.Mains.Save;

import br.edu.ifpb.es.daw.entities.Entrega;
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