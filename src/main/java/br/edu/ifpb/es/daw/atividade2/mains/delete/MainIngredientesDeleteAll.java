package br.edu.ifpb.es.daw.atividade2.mains.delete;

import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.dao.impl.IngredientesDAOImpl;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.IngredientesDAO;
import br.edu.ifpb.es.daw.entities.Ingredientes;

import java.util.List;

public class MainIngredientesDeleteAll {
    public static void main(String[] args) throws PersistenciaDawException {
        IngredientesDAO ingredientesDAO = new IngredientesDAOImpl();
        List<Ingredientes> todos = ingredientesDAO.getAll();
        for (Ingredientes c : todos) {
            ingredientesDAO.delete(c.getId());
        }
    }
}
