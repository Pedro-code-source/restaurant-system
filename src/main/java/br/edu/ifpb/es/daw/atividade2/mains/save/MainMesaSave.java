package br.edu.ifpb.es.daw.atividade2.mains.save;

import br.edu.ifpb.es.daw.entities.Mesa;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.MesaDAO;
import br.edu.ifpb.es.daw.dao.impl.MesaDAOImpl;
import br.edu.ifpb.es.daw.dao.PersistenciaDawException;

public class MainMesaSave {
    public static void main(String[] args) {
        MesaDAO mesaDAO = new MesaDAOImpl();
        Mesa novaMesa = new Mesa();
        Mesa novaMesa2 = new Mesa();

        novaMesa.setNumero(10);
        novaMesa.setCapacidade(4);
        novaMesa.setStatus("LIVRE");

        novaMesa2.setNumero(2);
        novaMesa2.setCapacidade(8);
        novaMesa2.setStatus("OCUPADA");

        try {
            System.out.println("Iniciando a operação de salvar Mesa...");
            mesaDAO.save(novaMesa);
            mesaDAO.save(novaMesa2);
            System.out.println("Mesa salva com sucesso.");
            System.out.println("Detalhes: ID " + novaMesa.getId() + ", Número: " + novaMesa.getNumero());
            System.out.println("Detalhes: ID " + novaMesa2.getId() + ", Número: " + novaMesa2.getNumero());

        } catch (PersistenciaDawException e) {
            System.err.println("Erro de Persistência ao salvar Mesa: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }


    }
}