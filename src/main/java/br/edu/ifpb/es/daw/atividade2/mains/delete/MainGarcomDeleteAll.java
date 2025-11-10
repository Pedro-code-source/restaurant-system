package br.edu.ifpb.es.daw.atividade2.mains.delete;

import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.dao.impl.GarcomDAOImpl;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.GarcomDAO;
import br.edu.ifpb.es.daw.entities.Garcom;

import java.util.List;

public class MainGarcomDeleteAll {
    public static void main(String[] args) throws PersistenciaDawException {
        GarcomDAO garcomDAO = new GarcomDAOImpl();
        List<Garcom> todos = garcomDAO.getAll();
        for (Garcom c : todos) {
            garcomDAO.delete(c.getId());
        }

    }
}
