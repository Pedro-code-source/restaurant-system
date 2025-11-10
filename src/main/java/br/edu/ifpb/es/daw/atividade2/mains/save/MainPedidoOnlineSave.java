package br.edu.ifpb.es.daw.atividade2.mains.save;

import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.dao.impl.ClienteDAOImpl;
import br.edu.ifpb.es.daw.dao.impl.EntregaDAOImpl;
import br.edu.ifpb.es.daw.dao.impl.PedidoOnlineDAOImpl;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.ClienteDAO;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.EntregaDAO;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.PedidoOnlineDAO;
import br.edu.ifpb.es.daw.entities.*;

public class MainPedidoOnlineSave {
    public static void main(String[] args) throws PersistenciaDawException {
        PedidoOnlineDAO pedidoOnlineDAO = new PedidoOnlineDAOImpl();
        ClienteDAO clienteDAO = new ClienteDAOImpl();
        EntregaDAO entregaDAO = new EntregaDAOImpl();

        Cliente cliente = new Cliente();
        cliente.setNome("Victor");
        cliente.setEmail("Victor@gmail.com");
        cliente.setSenha("ASSHH");
        cliente.setTelefone(999222938);
        cliente.setEndereco("Rua das COREs");

        clienteDAO.save(cliente);
        Entrega entrega = new Entrega();
        entrega.setNomeEntregador("Coelho Filho");
        entrega.setTelefoneEntregador(4028922);
        entregaDAO.save(entrega);

        PedidoOnline pedidoOnline = new PedidoOnline();
        pedidoOnline.setEntrega(entrega);
        pedidoOnline.setCliente(cliente);
        pedidoOnline.setStatus("Em entrega");
        pedidoOnline.setValorFinal(29);
        pedidoOnline.setFormaDePagamento("Pix");
        pedidoOnlineDAO.save(pedidoOnline);






    }
}
