package br.edu.ifpb.es.daw.dao.impl;

import br.edu.ifpb.es.daw.dao.intefarcesDaos.GarcomDAO;
import br.edu.ifpb.es.daw.entities.Garcom;
import br.edu.ifpb.es.daw.util.JPAUtil;

public class GarcomDAOImpl extends AbstractDAOImpl<Garcom, Integer> implements GarcomDAO {

    public GarcomDAOImpl() {
        super(Garcom.class, JPAUtil.getEntityManagerFactory());
    }
}
