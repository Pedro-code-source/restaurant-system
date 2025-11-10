package br.edu.ifpb.es.daw.atividade2.mains.save;

import br.edu.ifpb.es.daw.entities.Ingredientes;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.IngredientesDAO;
import br.edu.ifpb.es.daw.dao.impl.IngredientesDAOImpl;
import br.edu.ifpb.es.daw.dao.PersistenciaDawException;


public class MainIngredientesSave {
    public static void main(String[] args) {
        IngredientesDAO ingredientesDAO = new IngredientesDAOImpl();
        Ingredientes novoIngrediente = new Ingredientes();
        novoIngrediente.setNome("Farinha de Trigo");
        novoIngrediente.setQuantidade(5000);
        novoIngrediente.setUnidadeDeMedida("g");


        try {
            System.out.println("Iniciando a operação de salvar Ingrediente...");
            ingredientesDAO.save(novoIngrediente);

            System.out.println("✅ Ingrediente salvo com sucesso.");
            System.out.println("Detalhes: ID " + novoIngrediente.getId() + ", Nome: " + novoIngrediente.getNome());

        } catch (PersistenciaDawException e) {
            System.err.println("❌ Erro de Persistência ao salvar Ingrediente: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("❌ Erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }


    }
}