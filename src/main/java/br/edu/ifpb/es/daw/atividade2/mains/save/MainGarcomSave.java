package br.edu.ifpb.es.daw.atividade2.mains.save;

import br.edu.ifpb.es.daw.entities.Garcom;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.GarcomDAO;
import br.edu.ifpb.es.daw.dao.impl.GarcomDAOImpl;
import br.edu.ifpb.es.daw.dao.PersistenciaDawException;

public class MainGarcomSave {

    public static void main(String[] args) {
        GarcomDAO garcomDAO = new GarcomDAOImpl();
        Garcom novoGarcom = new Garcom();
        novoGarcom.setEmail("garcom.joao@restaurant.com");
        novoGarcom.setSenha("servico123");
        novoGarcom.setNome("João da Mesa");

        try {
            System.out.println("Iniciando a operação de salvar Garcom...");
            garcomDAO.save(novoGarcom);
            System.out.println("✅ Garcom salvo com sucesso.");
            System.out.println("Detalhes: ID " + novoGarcom.getId() + ", Nome: " + novoGarcom.getNome());

        } catch (PersistenciaDawException e) {
            System.err.println(" Erro de Persistência ao salvar Garcom: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println(" Erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }
}