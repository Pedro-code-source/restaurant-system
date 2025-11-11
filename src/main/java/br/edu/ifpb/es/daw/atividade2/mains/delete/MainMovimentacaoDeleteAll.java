package br.edu.ifpb.es.daw.atividade2.mains.delete;

import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.dao.impl.MovimentacaoDAOImpl;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.MovimentacaoDeEstoqueDAO;
import br.edu.ifpb.es.daw.entities.Ingredientes;
import br.edu.ifpb.es.daw.entities.MovimentacaoDeEstoque;
import br.edu.ifpb.es.daw.entities.PedidoOnline;

import java.util.List;

public class MainMovimentacaoDeleteAll {
    public static void main(String[] args) throws PersistenciaDawException {
        MovimentacaoDeEstoqueDAO movimentacaoDeEstoqueDAO = new MovimentacaoDAOImpl();
        List<MovimentacaoDeEstoque> todos = movimentacaoDeEstoqueDAO.getAll();

        Ingredientes ingrediente1 = new Ingredientes();
        ingrediente1.setNome("Tomate");
        ingrediente1.setQuantidade(200);
        ingrediente1.setUnidadeDeMedida("g");


        Ingredientes ingrediente2 = new Ingredientes();
        ingrediente2.setNome("Cebola");
        ingrediente2.setQuantidade(1);
        ingrediente2.setUnidadeDeMedida("kg");

        System.out.println("Encontradas " + todos.size() + " movimentações para deletar.");

        for (MovimentacaoDeEstoque c : todos) {
            movimentacaoDeEstoqueDAO.delete(c.getId());
        }

        List<MovimentacaoDeEstoque> restantes = movimentacaoDeEstoqueDAO.getAll();
        System.out.println("Movimentações restantes no banco: " + restantes.size());

    }
}
