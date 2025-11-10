package br.edu.ifpb.es.daw.atividade1.mains.save;

import br.edu.ifpb.es.daw.entities.Entrega;
import br.edu.ifpb.es.daw.util.JPAUtil;
import jakarta.persistence.EntityManager;

public class MainEntregaSave {
    public static void main(String[] args) {
        try(EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager()){


            em.getTransaction().begin();
            Entrega entrega = new Entrega();
            entrega.setNomeEntregador("João");
            entrega.setTelefoneEntregador(987675643);
            em.persist(entrega);
            em.getTransaction().commit();

        }

    }
}