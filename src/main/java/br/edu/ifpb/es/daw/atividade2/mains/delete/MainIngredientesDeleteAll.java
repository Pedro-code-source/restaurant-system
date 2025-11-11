package br.edu.ifpb.es.daw.atividade2.mains.delete;

import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.dao.impl.IngredientesDAOImpl;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.IngredientesDAO;
import br.edu.ifpb.es.daw.entities.Ingredientes;
import br.edu.ifpb.es.daw.entities.PedidoOnline;

import java.util.List;

public class MainIngredientesDeleteAll {
    public static void main(String[] args) throws PersistenciaDawException {
        IngredientesDAO ingredientesDAO = new IngredientesDAOImpl();
        List<Ingredientes> todos = ingredientesDAO.getAll();

        Ingredientes novoIngrediente = new Ingredientes();
        Ingredientes novoIngrediente2 = new Ingredientes();


        novoIngrediente.setNome("Farinha de Trigo");
        novoIngrediente.setQuantidade(5000);
        novoIngrediente.setUnidadeDeMedida("g");

        novoIngrediente2.setNome("Farinha de Mandioca");
        novoIngrediente2.setQuantidade(1);
        novoIngrediente2.setUnidadeDeMedida("kb");

        System.out.println("Encontrados " + todos.size() + " ingredientes para deletar.");

        for (Ingredientes c : todos) {
            ingredientesDAO.delete(c.getId());
        }

        List<Ingredientes> restantes = ingredientesDAO.getAll();
        System.out.println("Ingredientes restantes no banco: " + restantes.size());

    }
}
