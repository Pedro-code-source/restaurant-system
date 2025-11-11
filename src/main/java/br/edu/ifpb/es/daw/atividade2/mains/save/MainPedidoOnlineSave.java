package br.edu.ifpb.es.daw.atividade2.mains.save;

import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.dao.impl.ClienteDAOImpl;
import br.edu.ifpb.es.daw.dao.impl.EntregaDAOImpl;
import br.edu.ifpb.es.daw.dao.impl.PedidoOnlineDAOImpl;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.ClienteDAO;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.EntregaDAO;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.PedidoOnlineDAO;
import br.edu.ifpb.es.daw.entities.Cliente;
import br.edu.ifpb.es.daw.entities.Entrega;
import br.edu.ifpb.es.daw.entities.PedidoOnline;

public class MainPedidoOnlineSave {
    public static void main(String[] args) throws PersistenciaDawException {

        PedidoOnlineDAO pedidoOnlineDAO = new PedidoOnlineDAOImpl();
        ClienteDAO clienteDAO = new ClienteDAOImpl();
        EntregaDAO entregaDAO = new EntregaDAOImpl();
        
        Cliente cliente = new Cliente();
        Cliente cliente2 = new Cliente();
        Entrega entrega = new Entrega();
        Entrega entrega2 = new Entrega();
        PedidoOnline pedidoOnline = new PedidoOnline();

        cliente.setNome("João");
        cliente.setEndereco("Rua 123");
        cliente.setEmail("Joao@hotmail.com");
        cliente.setSenha("12345");
        cliente.setTelefone(134);

        cliente2.setNome("Jaindson");
        cliente2.setEndereco("Rua 456");
        cliente2.setEmail("Jaindson@hotmail.com");
        cliente2.setSenha("12345");
        cliente2.setTelefone(123);

        clienteDAO.save(cliente);
        clienteDAO.save(cliente2);

        entrega.setNomeEntregador("Roberto");
        entrega.setTelefoneEntregador(987);

        entrega2.setNomeEntregador("Pedro");
        entrega2.setTelefoneEntregador(123);

        entregaDAO.save(entrega);
        entregaDAO.save(entrega2);

        pedidoOnline.setFormaDePagamento("Pix");
        pedidoOnline.setStatus("Em Entrega");
        pedidoOnline.setValorFinal(120);
        pedidoOnline.setCliente(cliente);
        pedidoOnline.setEntregas(entrega);

        PedidoOnline pedidoOnline2 = new PedidoOnline();
        pedidoOnline2.setFormaDePagamento("Cartão");
        pedidoOnline2.setStatus("Em Entrega");
        pedidoOnline2.setValorFinal(120);
        pedidoOnline2.setCliente(cliente);
        pedidoOnline2.setEntregas(entrega2);


        pedidoOnlineDAO.save(pedidoOnline);
        pedidoOnlineDAO.save(pedidoOnline2);

    }
}
