package br.edu.ifpb.es.daw.dao.impl;

import br.edu.ifpb.es.daw.dao.intefarcesDaos.PedidoOnlineDAO;
import br.edu.ifpb.es.daw.entities.PedidoOnline;
import br.edu.ifpb.es.daw.entities.PedidoPresencial;
import br.edu.ifpb.es.daw.util.JPAUtil;

public class PedidoOnlineDAOImpl extends AbstractDAOImpl<PedidoOnline, Integer> implements PedidoOnlineDAO {

    public PedidoOnlineDAOImpl() {
        super(PedidoOnline.class, JPAUtil.getEntityManagerFactory());
    }
}
