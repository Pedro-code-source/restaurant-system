package br.edu.ifpb.es.daw.Atividade1.Mains.Delete;

import jakarta.persistence.EntityManager;

public class MainUsuarioDeleteAll {
    public static void main(String[] args) {

        try(EntityManager em = EMF.getEntityManager()){

            em.getTransaction().begin();
            em.createQuery("delete from Usuario").executeUpdate();
            em.getTransaction().commit();
            em.clear();
        }
    }
}