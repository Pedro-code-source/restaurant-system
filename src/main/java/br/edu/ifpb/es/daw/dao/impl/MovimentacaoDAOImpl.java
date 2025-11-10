package br.edu.ifpb.es.daw.dao.impl;

import br.edu.ifpb.es.daw.dao.intefarcesDaos.MovimentacaoDeEstoqueDAO;
import br.edu.ifpb.es.daw.entities.MovimentacaoDeEstoque;
import br.edu.ifpb.es.daw.util.JPAUtil;

public class MovimentacaoDAOImpl extends AbstractDAOImpl<MovimentacaoDeEstoque, Integer> implements MovimentacaoDeEstoqueDAO {

    public MovimentacaoDAOImpl() {
        super(MovimentacaoDeEstoque.class, JPAUtil.getEntityManagerFactory());
    }
}
