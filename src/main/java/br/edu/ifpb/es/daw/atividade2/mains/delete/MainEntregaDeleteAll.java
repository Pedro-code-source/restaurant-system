package br.edu.ifpb.es.daw.atividade2.mains.delete;

import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.dao.impl.EntregaDAOImpl;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.EntregaDAO;
import br.edu.ifpb.es.daw.entities.Entrega;
import br.edu.ifpb.es.daw.entities.PedidoOnline;

import java.util.List;

public class MainEntregaDeleteAll {
    public static void main(String[] args) throws PersistenciaDawException {
        EntregaDAO entregaDAO = new EntregaDAOImpl();
        List<Entrega> todos = entregaDAO.getAll();

        Entrega novaEntrega = new Entrega();
        Entrega novaEntrega2 = new Entrega();


        novaEntrega.setNomeEntregador("Maria Entregadora");
        novaEntrega.setTelefoneEntregador(99876543);

        novaEntrega2.setNomeEntregador("Joana Entregadora");
        novaEntrega2.setTelefoneEntregador(99876543);

        System.out.println("Encontrada " + todos.size() + " entregas para deletar.");

        for (Entrega c : todos) {
            entregaDAO.delete(c.getId());
        }

        List<Entrega> restantes = entregaDAO.getAll();
        System.out.println("Entregas restantes no banco: " + restantes.size());

    }
}
