package br.edu.ifpb.es.daw.dao.impl;

import br.edu.ifpb.es.daw.dao.intefarcesDaos.MesaDAO;
import br.edu.ifpb.es.daw.entities.Mesa;
import br.edu.ifpb.es.daw.util.JPAUtil;

public class MesaDAOImpl extends AbstractDAOImpl<Mesa, Integer> implements MesaDAO {

    public MesaDAOImpl() {
        super(Mesa.class, JPAUtil.getEntityManagerFactory());
    }
}
