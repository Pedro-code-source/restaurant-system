package br.edu.ifpb.es.daw.atividade2.mains.delete;

import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.dao.impl.ReservaDAOImpl;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.ReservaDAO;
import br.edu.ifpb.es.daw.entities.Reserva;

import java.util.List;

public class MainReservaDeleteAll {
    public static void main(String[] args) throws PersistenciaDawException {
        ReservaDAO reservaDAO = new ReservaDAOImpl();
        List<Reserva> todos = reservaDAO.getAll();
        for (Reserva c : todos) {
            reservaDAO.delete(c.getId());
        }

    }
}
