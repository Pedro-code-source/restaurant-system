package br.edu.ifpb.es.daw.atividade2.mains.delete;

import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.dao.impl.ReservaDAOImpl;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.ReservaDAO;
import br.edu.ifpb.es.daw.entities.Cliente;
import br.edu.ifpb.es.daw.entities.Mesa;
import br.edu.ifpb.es.daw.entities.PedidoOnline;
import br.edu.ifpb.es.daw.entities.Reserva;

import java.util.Date;
import java.util.List;

public class MainReservaDeleteAll {
    public static void main(String[] args) throws PersistenciaDawException {
        ReservaDAO reservaDAO = new ReservaDAOImpl();
        List<Reserva> todos = reservaDAO.getAll();

        Cliente cliente = new Cliente();
        cliente.setNome("Junior");
        cliente.setEmail("junior@gmail.com");
        cliente.setSenha("ASSHH");
        cliente.setTelefone(9992938);
        cliente.setEndereco("Rua das Dores");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Junior");
        cliente2.setEmail("junior@gmail.com");
        cliente2.setSenha("ASSHH");
        cliente2.setTelefone(9992938);
        cliente2.setEndereco("Rua das Dores");

        Mesa mesa = new Mesa();
        mesa.setCapacidade(4);
        mesa.setNumero(00);
        mesa.setStatus("Livre");

        Mesa mesa2 = new Mesa();
        mesa2.setCapacidade(4);
        mesa2.setNumero(00);
        mesa2.setStatus("Livre");

        Reserva reserva = new Reserva();
        reserva.setValorDaReserva(20);
        reserva.setDataEHora(new Date());
        reserva.setMesa(mesa);
        reserva.setCliente(cliente);

        Reserva reserva2 = new Reserva();
        reserva2.setValorDaReserva(20);
        reserva2.setDataEHora(new Date());
        reserva2.setMesa(mesa);
        reserva2.setCliente(cliente2);

        System.out.println("Encontradas " + todos.size() + " reservas para deletar.");

        for (Reserva c : todos) {
            reservaDAO.delete(c.getId());
        }

        List<Reserva> restantes = reservaDAO.getAll();
        System.out.println("Reservas restantes no banco: " + restantes.size());

    }
}
