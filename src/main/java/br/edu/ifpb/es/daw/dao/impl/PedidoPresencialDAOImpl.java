package br.edu.ifpb.es.daw.dao.impl;

import br.edu.ifpb.es.daw.dao.intefarcesDaos.PedidoPresencialDAO;
import br.edu.ifpb.es.daw.entities.PedidoPresencial;
import br.edu.ifpb.es.daw.util.JPAUtil;

public class PedidoPresencialDAOImpl extends AbstractDAOImpl<PedidoPresencial, Integer> implements PedidoPresencialDAO {

    public PedidoPresencialDAOImpl() {
        super(PedidoPresencial.class, JPAUtil.getEntityManagerFactory());
    }
}
