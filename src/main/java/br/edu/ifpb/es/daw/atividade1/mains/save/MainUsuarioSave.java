package br.edu.ifpb.es.daw.atividade1.mains.save;

import br.edu.ifpb.es.daw.entities.Usuario;
import br.edu.ifpb.es.daw.util.JPAUtil;
import jakarta.persistence.EntityManager;

public class MainUsuarioSave {
    public static void main(String[] args) {

        try(EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager()){

            em.getTransaction().begin();

            Usuario usuario = new Usuario();
            usuario.setEmail("pedro@gmail.com");
            usuario.setSenha("123456");
            em.persist(usuario);
            em.getTransaction().commit();

        }
    }
}