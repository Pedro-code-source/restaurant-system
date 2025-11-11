package br.edu.ifpb.es.daw.atividade2.mains.delete;

import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.dao.impl.PedidoPresencialDAOImpl;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.PedidoPresencialDAO;
import br.edu.ifpb.es.daw.entities.*;

import java.util.List;

public class MainPedidoPresencialDeleteAll {
    public static void main(String[] args) throws PersistenciaDawException {
        PedidoPresencialDAO pedidoPresencialDAO = new PedidoPresencialDAOImpl();
        List<PedidoPresencial> todos = pedidoPresencialDAO.getAll();

        Cliente cliente = new Cliente();
        cliente.setNome("Victor");
        cliente.setEmail("Victor@gmail.com");
        cliente.setSenha("ASSHH");
        cliente.setTelefone(999222938);
        cliente.setEndereco("Rua das COREs");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Victor");
        cliente2.setEmail("Victor@gmail.com");
        cliente2.setSenha("ASSHH");
        cliente2.setTelefone(999222938);
        cliente2.setEndereco("Rua das COREs");

        Garcom garcom = new Garcom();
        garcom.setNome("Alfred");
        garcom.setEmail("alfred@gmail.com");
        garcom.setSenha("Alfred123");

        Garcom garcom2 = new Garcom();
        garcom2.setNome("Alfred");
        garcom2.setEmail("alfred@gmail.com");
        garcom2.setSenha("Alfred123");

        Mesa mesa = new Mesa();
        mesa.setStatus("LIVRE");
        mesa.setNumero(31);
        mesa.setCapacidade(4);

        Mesa mesa2 = new Mesa();
        mesa2.setStatus("LIVRE");
        mesa2.setNumero(31);
        mesa2.setCapacidade(4);

        PedidoPresencial pedidoPresencial = new PedidoPresencial();
        pedidoPresencial.setGarcom(garcom);
        pedidoPresencial.setCliente(cliente);
        pedidoPresencial.setStatus("Em Aberto");
        pedidoPresencial.setMesa(mesa);
        pedidoPresencial.setFormaDePagamento("Pix");

        PedidoPresencial pedidoPresencial2 = new PedidoPresencial();
        pedidoPresencial2.setGarcom(garcom);
        pedidoPresencial2.setCliente(cliente);
        pedidoPresencial2.setStatus("Em Aberto");
        pedidoPresencial2.setMesa(mesa);
        pedidoPresencial2.setFormaDePagamento("Pix");

        System.out.println("Encontrados " + todos.size() + " pedidos presenciais para deletar.");

        for (PedidoPresencial c : todos) {
            pedidoPresencialDAO.delete(c.getId());
        }

        List<PedidoPresencial> restantes = pedidoPresencialDAO.getAll();
        System.out.println("Pedidos presenciais restantes no banco: " + restantes.size());

    }
}
