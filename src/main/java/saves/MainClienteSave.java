package saves;

import dao.ClienteDAO;
import util.EMF;
import entities.Cliente;
import jakarta.persistence.EntityManager;


public class MainClienteSave {
    public static void main(String[] args) {
        try(EntityManager em = EMF.getEntityManager()){

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
