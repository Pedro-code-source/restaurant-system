package br.edu.ifpb.es.daw.atividade2.mains.delete;

import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.dao.impl.PedidoDAOImpl;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.PedidoDAO;
import br.edu.ifpb.es.daw.entities.*;

import java.util.List;

public class MainPedidoDeleteAll {
    public static void main(String[] args) throws PersistenciaDawException {
        PedidoDAO pedidoDAO = new PedidoDAOImpl();
        List<Pedido> todos = pedidoDAO.getAll();

        Cliente cliente = new Cliente();
        cliente.setNome("João");
        cliente.setEndereco("Rua 123");
        cliente.setEmail("Joao@hotmail.com");
        cliente.setSenha("12345");
        cliente.setTelefone(134);

        Entrega entrega = new Entrega();
        entrega.setNomeEntregador("Roberto");
        entrega.setTelefoneEntregador(987);

        PedidoOnline pedidoOnline = new PedidoOnline();
        pedidoOnline.setFormaDePagamento("Pix");
        pedidoOnline.setStatus("Em Entrega");
        pedidoOnline.setValorFinal(120);
        pedidoOnline.setCliente(cliente);
        pedidoOnline.setEntregas(entrega);

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

        Mesa mesa = new Mesa();
        mesa.setStatus("LIVRE");
        mesa.setNumero(31);
        mesa.setCapacidade(4);

        PedidoPresencial pedidoPresencial = new PedidoPresencial();
        pedidoPresencial.setGarcom(garcom);
        pedidoPresencial.setCliente(cliente);
        pedidoPresencial.setStatus("Em Aberto");
        pedidoPresencial.setMesa(mesa);
        pedidoPresencial.setFormaDePagamento("Pix");

        System.out.println("Encontrados " + todos.size() + " pedidos para deletar.");

        for (Pedido c : todos) {
            pedidoDAO.delete(c.getId());
        }

        List<Pedido> restantes = pedidoDAO.getAll();
        System.out.println("Pedidos restantes no banco: " + restantes.size());

    }

}

