package br.edu.ifpb.es.daw.dao.impl;

import br.edu.ifpb.es.daw.dao.intefarcesDaos.EntregaDAO;
import br.edu.ifpb.es.daw.entities.Entrega;
import br.edu.ifpb.es.daw.util.JPAUtil;

public class EntregaDAOImpl extends  AbstractDAOImpl<Entrega, Integer> implements EntregaDAO {

    public EntregaDAOImpl() {
        super(Entrega.class, JPAUtil.getEntityManagerFactory());
    }
}
