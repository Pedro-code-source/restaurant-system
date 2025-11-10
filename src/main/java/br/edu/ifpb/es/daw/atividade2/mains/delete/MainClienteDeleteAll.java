package br.edu.ifpb.es.daw.atividade2.mains.delete;

import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.dao.impl.ClienteDAOImpl;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.ClienteDAO;
import br.edu.ifpb.es.daw.entities.Cliente;

import java.util.List;


public class MainClienteDeleteAll {
    public static void main(String[] args) throws PersistenciaDawException {
        ClienteDAO clienteDAO = new ClienteDAOImpl();
        List<Cliente> todos = clienteDAO.getAll();
        for (Cliente c : todos) {
            clienteDAO.delete(c.getId());
        }

    }
}
