package br.edu.ifpb.es.daw.atividade2.mains.delete;

import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.dao.impl.MesaDAOImpl;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.MesaDAO;
import br.edu.ifpb.es.daw.entities.Mesa;

import java.util.List;

public class MainMesaDeleteAll {
    public static void main(String[] args) throws PersistenciaDawException {
        MesaDAO mesaDAO = new MesaDAOImpl();
        List<Mesa> todos = mesaDAO.getAll();
        for (Mesa c : todos) {
            mesaDAO.delete(c.getId());
        }

    }
}
