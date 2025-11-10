package br.edu.ifpb.es.daw.dao.impl;

import br.edu.ifpb.es.daw.dao.intefarcesDaos.ClienteDAO;
import br.edu.ifpb.es.daw.entities.Cliente;
import br.edu.ifpb.es.daw.util.JPAUtil;

public class ClienteDAOImpl extends AbstractDAOImpl<Cliente, Integer> implements ClienteDAO {

    public ClienteDAOImpl() {
        super(Cliente.class, JPAUtil.getEntityManagerFactory());
    }
}
