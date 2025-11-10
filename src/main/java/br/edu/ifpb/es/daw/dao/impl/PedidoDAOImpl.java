package br.edu.ifpb.es.daw.dao.impl;

import br.edu.ifpb.es.daw.dao.intefarcesDaos.PedidoDAO;
import br.edu.ifpb.es.daw.entities.Pedido;
import br.edu.ifpb.es.daw.util.JPAUtil;

public class PedidoDAOImpl extends AbstractDAOImpl<Pedido, Integer> implements PedidoDAO {

    public PedidoDAOImpl() {
        super(Pedido.class, JPAUtil.getEntityManagerFactory());
    }
}
