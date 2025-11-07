package br.edu.ifpb.es.daw.Atividade1.Mains.Save;

import br.edu.ifpb.es.daw.entities.Usuario;
import jakarta.persistence.EntityManager;

public class MainUsuarioSave {
    public static void main(String[] args) {

        try(EntityManager em = EMF.getEntityManager()){

            em.getTransaction().begin();

            Usuario usuario = new Usuario();
            usuario.setEmail("pedro@gmail.com");
            usuario.setSenha("123456");
            em.persist(usuario);
            em.getTransaction().commit();

        }
    }
}