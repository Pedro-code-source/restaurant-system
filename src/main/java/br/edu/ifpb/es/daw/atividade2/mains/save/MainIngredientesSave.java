package br.edu.ifpb.es.daw.atividade2.mains.save;

import br.edu.ifpb.es.daw.entities.Ingredientes;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.IngredientesDAO;
import br.edu.ifpb.es.daw.dao.impl.IngredientesDAOImpl;
import br.edu.ifpb.es.daw.dao.PersistenciaDawException;


public class MainIngredientesSave {
    public static void main(String[] args) {
        IngredientesDAO ingredientesDAO = new IngredientesDAOImpl();
        Ingredientes novoIngrediente = new Ingredientes();
        Ingredientes novoIngrediente2 = new Ingredientes();


        novoIngrediente.setNome("Farinha de Trigo");
        novoIngrediente.setQuantidade(5000);
        novoIngrediente.setUnidadeDeMedida("g");

        novoIngrediente2.setNome("Farinha de Mandioca");
        novoIngrediente2.setQuantidade(1);
        novoIngrediente2.setUnidadeDeMedida("kb");


        try {
            System.out.println("Iniciando a operação de salvar Ingrediente...");
            ingredientesDAO.save(novoIngrediente);
            ingredientesDAO.save(novoIngrediente2);

            System.out.println("Ingrediente salvo com sucesso.");
            System.out.println("Detalhes: ID " + novoIngrediente.getId() + ", Nome: " + novoIngrediente.getNome());
            System.out.println("Detalhes: ID " + novoIngrediente2.getId() + ", Nome: " + novoIngrediente2.getNome());

        } catch (PersistenciaDawException e) {
            System.err.println("Erro de Persistência ao salvar Ingrediente: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }


    }
}