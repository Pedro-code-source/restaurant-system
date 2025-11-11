package br.edu.ifpb.es.daw.atividade2.mains.delete;

import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.dao.impl.GarcomDAOImpl;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.GarcomDAO;
import br.edu.ifpb.es.daw.entities.Garcom;
import br.edu.ifpb.es.daw.entities.PedidoOnline;

import java.util.List;

public class MainGarcomDeleteAll {
    public static void main(String[] args) throws PersistenciaDawException {
        GarcomDAO garcomDAO = new GarcomDAOImpl();
        List<Garcom> todos = garcomDAO.getAll();

        Garcom novoGarcom = new Garcom();
        Garcom novoGarcom2 = new Garcom();

        novoGarcom.setEmail("garcom.joao@restaurant.com");
        novoGarcom.setSenha("servico123");
        novoGarcom.setNome("João da Mesa");

        novoGarcom2.setEmail("garcom.joao@restaurant.com");
        novoGarcom2.setSenha("servico123");
        novoGarcom2.setNome("Pedo da Mesa");

        System.out.println("Encontrado " + todos.size() + " garçons para deletar.");

        for (Garcom c : todos) {
            garcomDAO.delete(c.getId());
        }

        List<Garcom> restantes = garcomDAO.getAll();
        System.out.println("Garçons restantes no banco: " + restantes.size());

    }
}
