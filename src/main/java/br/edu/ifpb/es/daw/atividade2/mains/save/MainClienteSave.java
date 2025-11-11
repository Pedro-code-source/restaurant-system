package br.edu.ifpb.es.daw.atividade2.mains.save;

import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.dao.impl.ClienteDAOImpl;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.ClienteDAO;
import br.edu.ifpb.es.daw.entities.Cliente;

public class MainClienteSave {
    public static void main(String[] args) throws PersistenciaDawException {

        ClienteDAO clienteDAO = new ClienteDAOImpl();
        Cliente cliente = new Cliente();

        cliente.setNome("Pedro");
        cliente.setEndereco("Manoel Guedes da Costa, 120");
        cliente.setTelefone(12345);
        cliente.setEmail("Joao@hotmail.com");
        cliente.setSenha("12345");

        Cliente cliente2 = new Cliente();

        cliente2.setNome("João");
        cliente2.setEndereco("Manoel Guedes da Costa, 120");
        cliente2.setTelefone(12345);
        cliente2.setEmail("Joao@hotmail.com");
        cliente2.setSenha("12345");

        clienteDAO.save(cliente);
        clienteDAO.save(cliente2);
    }
}