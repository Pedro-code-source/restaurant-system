package br.edu.ifpb.es.daw.atividade2.mains.delete;

import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.dao.impl.MovimentacaoDAOImpl;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.MovimentacaoDeEstoqueDAO;
import br.edu.ifpb.es.daw.entities.MovimentacaoDeEstoque;

import java.util.List;

public class MainMovimentacaoDeleteAll {
    public static void main(String[] args) throws PersistenciaDawException {
        MovimentacaoDeEstoqueDAO movimentacaoDeEstoqueDAO = new MovimentacaoDAOImpl();
        List<MovimentacaoDeEstoque> todos = movimentacaoDeEstoqueDAO.getAll();
        for (MovimentacaoDeEstoque c : todos) {
            movimentacaoDeEstoqueDAO.delete(c.getId());
        }

    }
}
