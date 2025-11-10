package br.edu.ifpb.es.daw.atividade2.mains.delete;

import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.dao.impl.PedidoPresencialDAOImpl;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.PedidoPresencialDAO;
import br.edu.ifpb.es.daw.entities.PedidoPresencial;

import java.util.List;

public class MainPedidoPresencialDeleteAll {
    public static void main(String[] args) throws PersistenciaDawException {
        PedidoPresencialDAO pedidoPresencialDAO = new PedidoPresencialDAOImpl();
        List<PedidoPresencial> todos = pedidoPresencialDAO.getAll();
        for (PedidoPresencial c : todos) {
            pedidoPresencialDAO.delete(c.getId());
        }

    }
}
