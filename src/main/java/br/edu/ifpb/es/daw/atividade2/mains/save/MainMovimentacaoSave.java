package br.edu.ifpb.es.daw.atividade2.mains.save;

import br.edu.ifpb.es.daw.entities.MovimentacaoDeEstoque;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.MovimentacaoDeEstoqueDAO;
import br.edu.ifpb.es.daw.dao.impl.MovimentacaoDAOImpl;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.IngredientesDAO;
import br.edu.ifpb.es.daw.dao.impl.IngredientesDAOImpl;
import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.entities.Ingredientes;

import java.util.ArrayList;
import java.util.Date;

public class MainMovimentacaoSave {
    public static void main(String[] args) throws PersistenciaDawException {

        MovimentacaoDeEstoqueDAO movDAO = new MovimentacaoDAOImpl();
        IngredientesDAO ingDAO = new IngredientesDAOImpl();

        Ingredientes tomate = new Ingredientes();
        tomate.setNome("tomate");
        tomate.setQuantidade(200);
        tomate.setUnidadeDeMedida("g");
        ingDAO.save(tomate);

        MovimentacaoDeEstoque movimentacaoDeEstoque = new MovimentacaoDeEstoque();
        movimentacaoDeEstoque.setQuantidade(3);
        movimentacaoDeEstoque.setTipoDeMovimentacao("ENTRADA");
        movimentacaoDeEstoque.setDataCriacao(new Date());

        if (movimentacaoDeEstoque.getIngrediente()==null){
            movimentacaoDeEstoque.setIngrediente(new ArrayList<>());
        }
        movimentacaoDeEstoque.getIngrediente().add(tomate);

        movDAO.save(movimentacaoDeEstoque);




    }
}