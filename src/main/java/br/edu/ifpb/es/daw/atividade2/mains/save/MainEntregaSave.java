package br.edu.ifpb.es.daw.atividade2.mains.save;

import br.edu.ifpb.es.daw.entities.Entrega;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.EntregaDAO;
import br.edu.ifpb.es.daw.dao.impl.EntregaDAOImpl;
import br.edu.ifpb.es.daw.dao.PersistenciaDawException;


public class MainEntregaSave {
    public static void main(String[] args) {
        EntregaDAO entregaDAO = new EntregaDAOImpl();
        Entrega novaEntrega = new Entrega();
        novaEntrega.setNomeEntregador("Maria Entregadora");
        novaEntrega.setTelefoneEntregador(99876543);

        try {
            System.out.println("Iniciando a operação de salvar Entrega...");

            entregaDAO.save(novaEntrega);

            System.out.println("Entrega salva com sucesso.");
            System.out.println("Detalhes: ID " + novaEntrega.getId() + ", Responsável: " + novaEntrega.getNomeEntregador());

        } catch (PersistenciaDawException e) {
            System.err.println("Erro de Persistência ao salvar Entrega: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }


    }
}