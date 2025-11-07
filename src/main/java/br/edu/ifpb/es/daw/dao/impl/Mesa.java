package br.edu.ifpb.es.daw.dao.impl;

import br.edu.ifpb.es.daw.dao.intefarcesDaos.MesaDAO;
import br.edu.ifpb.es.daw.util.JPAUtil;

public class Mesa extends AbstractDAOImpl<Mesa, Integer> implements MesaDAO {

    public Mesa() {
        super(Mesa.class, JPAUtil.getEntityManagerFactory());
    }
}
