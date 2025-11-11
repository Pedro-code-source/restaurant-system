package br.edu.ifpb.es.daw.atividade2.mains.save;

import br.edu.ifpb.es.daw.entities.Garcom;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.GarcomDAO;
import br.edu.ifpb.es.daw.dao.impl.GarcomDAOImpl;
import br.edu.ifpb.es.daw.dao.PersistenciaDawException;

public class MainGarcomSave {

    public static void main(String[] args) {
        GarcomDAO garcomDAO = new GarcomDAOImpl();
        Garcom novoGarcom = new Garcom();
        Garcom novoGarcom2 = new Garcom();

        novoGarcom.setEmail("garcom.joao@restaurant.com");
        novoGarcom.setSenha("servico123");
        novoGarcom.setNome("João da Mesa");

        novoGarcom2.setEmail("garcom.joao@restaurant.com");
        novoGarcom2.setSenha("servico123");
        novoGarcom2.setNome("Pedo da Mesa");

        try {
            System.out.println("Iniciando a operação de salvar Garcom...");
            garcomDAO.save(novoGarcom);
            garcomDAO.save(novoGarcom2);
            System.out.println("Garcom salvo com sucesso.");
            System.out.println("Detalhes: ID " + novoGarcom.getId() + ", Nome: " + novoGarcom.getNome());
            System.out.println("Detalhes: ID " + novoGarcom2.getId() + ", Nome: " + novoGarcom2.getNome());

        } catch (PersistenciaDawException e) {
            System.err.println("Erro de Persistência ao salvar Garcom: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }
}