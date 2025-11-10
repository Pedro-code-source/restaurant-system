package br.edu.ifpb.es.daw.atividade2.mains.save;

import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.dao.impl.ClienteDAOImpl;
import br.edu.ifpb.es.daw.dao.impl.MesaDAOImpl;
import br.edu.ifpb.es.daw.dao.impl.ReservaDAOImpl;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.ClienteDAO;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.MesaDAO;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.ReservaDAO;
import br.edu.ifpb.es.daw.entities.Cliente;
import br.edu.ifpb.es.daw.entities.Mesa;
import br.edu.ifpb.es.daw.entities.Reserva;

import java.util.Date;

public class MainReservaSave {
    public static void main(String[] args) throws PersistenciaDawException {


        ReservaDAO reservaDAO = new ReservaDAOImpl();
        ClienteDAO clienteDAO = new ClienteDAOImpl();
        MesaDAO mesaDAO = new MesaDAOImpl();

        Cliente cliente = new Cliente();
        cliente.setNome("Junior");
        cliente.setEmail("junior@gmail.com");
        cliente.setSenha("ASSHH");
        cliente.setTelefone(9992938);
        cliente.setEndereco("Rua das Dores");

        clienteDAO.save(cliente);

        Mesa mesa = new Mesa();
        mesa.setCapacidade(4);
        mesa.setNumero(00);
        mesa.setStatus("Livre");

        mesaDAO.save(mesa);

        Reserva reserva = new Reserva();
        reserva.setValorDaReserva(20);
        reserva.setDataEHora(new Date());
        reserva.setMesa(mesa);
        reserva.setCliente(cliente);

        reservaDAO.save(reserva);

        try {
            reservaDAO.save(reserva);
            System.out.println("Reserva salva com sucesso! ID: " + reserva.getId());
        } catch (PersistenciaDawException e) {
            System.err.println("Erro de Persistência: " + e.getMessage());
            e.printStackTrace();
        }




    }
}