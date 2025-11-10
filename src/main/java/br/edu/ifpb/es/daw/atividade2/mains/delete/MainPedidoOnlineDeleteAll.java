package br.edu.ifpb.es.daw.atividade2.mains.delete;

import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.dao.impl.PedidoOnlineDAOImpl;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.PedidoOnlineDAO;
import br.edu.ifpb.es.daw.entities.PedidoOnline;

import java.util.List;

public class MainPedidoOnlineDeleteAll {
    public static void main(String[] args) throws PersistenciaDawException {
        PedidoOnlineDAO pedidoOnlineDAO = new PedidoOnlineDAOImpl();
        List<PedidoOnline> todos = pedidoOnlineDAO.getAll();
        for (PedidoOnline c : todos) {
            pedidoOnlineDAO.delete(c.getId());
        }

    }

}
