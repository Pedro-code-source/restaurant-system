package br.edu.ifpb.es.daw.Atividade1.Mains.Save;

import br.edu.ifpb.es.daw.entities.Ingredientes;
import jakarta.persistence.EntityManager;

public class MainIngredientesSave {
    public static void main(String[] args) {
        try(EntityManager em = EMF.getEntityManager()){

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