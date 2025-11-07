package br.edu.ifpb.es.daw.Atividade1.Mains.Save;

import br.edu.ifpb.es.daw.entities.Cliente;
import br.edu.ifpb.es.daw.util.JPAUtil;
import jakarta.persistence.EntityManager;

public class MainClienteSave {
    public static void main(String[] args) {
        try(EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager()){

            em.getTransaction().begin();
            Cliente cliente = new Cliente();
            cliente.setEndereco("Rua robert mamao");
            cliente.setTelefone(88954367);
            cliente.setNome("João");
            em.persist(cliente);
            em.getTransaction().commit();
        }

    }
}