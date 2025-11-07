package br.edu.ifpb.es.daw.Atividade1.Mains.Save;

import br.edu.ifpb.es.daw.entities.Entrega;
import br.edu.ifpb.es.daw.util.JPAUtil;
import jakarta.persistence.EntityManager;

public class MainEntregaSave {
    public static void main(String[] args) {
        try(EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager()){


            em.getTransaction().begin();
            Entrega entrega = new Entrega();
            entrega.setNome("João");
            entrega.setTelefone(987675643);
            em.persist(entrega);
            em.getTransaction().commit();

        }

    }
}