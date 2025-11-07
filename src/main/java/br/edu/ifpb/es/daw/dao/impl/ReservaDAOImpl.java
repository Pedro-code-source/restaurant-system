package br.edu.ifpb.es.daw.dao.impl;

import br.edu.ifpb.es.daw.dao.intefarcesDaos.ReservaDAO;
import br.edu.ifpb.es.daw.entities.Reserva;
import br.edu.ifpb.es.daw.util.JPAUtil;

public class ReservaDAOImpl extends AbstractDAOImpl<Reserva, Integer> implements ReservaDAO {

    public ReservaDAOImpl() {
        super(Reserva.class, JPAUtil.getEntityManagerFactory());
    }
}
