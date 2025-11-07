package br.edu.ifpb.es.daw.dao.impl;

import br.edu.ifpb.es.daw.dao.intefarcesDaos.IngredientesDAO;
import br.edu.ifpb.es.daw.entities.Ingredientes;
import br.edu.ifpb.es.daw.util.JPAUtil;

public class IngredientesDAOImpl extends AbstractDAOImpl<Ingredientes, Integer> implements IngredientesDAO {

    public IngredientesDAOImpl() {
        super(Ingredientes.class, JPAUtil.getEntityManagerFactory());
    }
}
