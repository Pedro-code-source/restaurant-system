package br.edu.ifpb.es.daw.atividade1.mains.delete;

import br.edu.ifpb.es.daw.util.JPAUtil;
import jakarta.persistence.EntityManager;

public class MainIngredientesDeleteAll {
    public static void main(String[] args) {

        try(EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager()){

            em.getTransaction().begin();
            em.createQuery("delete from Ingredientes").executeUpdate();
            em.getTransaction().commit();
            em.clear();
        }
    }
}