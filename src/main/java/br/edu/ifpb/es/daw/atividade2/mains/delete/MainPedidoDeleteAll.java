package br.edu.ifpb.es.daw.atividade2.mains.delete;

import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.dao.impl.PedidoDAOImpl;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.PedidoDAO;
import br.edu.ifpb.es.daw.entities.Pedido;

import java.util.List;

public class MainPedidoDeleteAll {
    public static void main(String[] args) throws PersistenciaDawException {
            PedidoDAO pedidoDAO = new PedidoDAOImpl();
            List<Pedido> todos = pedidoDAO.getAll();
            for (Pedido c : todos) {
                pedidoDAO.delete(c.getId());
            }

        }

    }

