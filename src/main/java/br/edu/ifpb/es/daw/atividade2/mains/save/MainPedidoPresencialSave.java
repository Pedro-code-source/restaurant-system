package br.edu.ifpb.es.daw.atividade2.mains.save;

import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.dao.impl.*;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.*;
import br.edu.ifpb.es.daw.entities.Cliente;
import br.edu.ifpb.es.daw.entities.Garcom;
import br.edu.ifpb.es.daw.entities.Mesa;
import br.edu.ifpb.es.daw.entities.PedidoPresencial;

public class MainPedidoPresencialSave {
    public static void main(String[] args) throws PersistenciaDawException {
        GarcomDAO garcomDAO = new GarcomDAOImpl();
        MesaDAO mesaDAO = new MesaDAOImpl();
        ClienteDAO clienteDAO = new ClienteDAOImpl();
        PedidoPresencialDAO pedidoPresencialDAO = new PedidoPresencialDAOImpl();

        Cliente cliente = new Cliente();
        cliente.setNome("Victor");
        cliente.setEmail("Victor@gmail.com");
        cliente.setSenha("ASSHH");
        cliente.setTelefone(999222938);
        cliente.setEndereco("Rua das COREs");
        clienteDAO.save(cliente);

        Garcom garcom = new Garcom();
        garcom.setNome("Alfred");
        garcom.setEmail("alfred@gmail.com");
        garcom.setSenha("Alfred123");
        garcomDAO.save(garcom);

        Mesa mesa = new Mesa();
        mesa.setStatus("LIVRE");
        mesa.setNumero(31);
        mesa.setCapacidade(4);

        mesaDAO.save(mesa);

        PedidoPresencial pedidoPresencial = new PedidoPresencial();
        pedidoPresencial.setGarcom(garcom);
        pedidoPresencial.setCliente(cliente);
        pedidoPresencial.setStatus("Em Aberto");
        pedidoPresencial.setMesa(mesa);
        pedidoPresencial.setFormaDePagamento("Pix");
        pedidoPresencialDAO.save(pedidoPresencial);



    }
}