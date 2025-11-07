package br.edu.ifpb.es.daw.Atividade1.Mains.Save;

import br.edu.ifpb.es.daw.entities.Ingredientes;
import br.edu.ifpb.es.daw.util.JPAUtil;
import jakarta.persistence.EntityManager;

public class MainIngredientesSave {
    public static void main(String[] args) {
        try(EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager()){

            em.getTransaction().begin();
            Ingredientes ingredientes = new Ingredientes();
            ingredientes.setNome("Farinha");
            ingredientes.setQuantidade(100);
            ingredientes.setUnidadeDeMedida("kg");
            em.persist(ingredientes);
            em.getTransaction().commit();
        }
    }
}