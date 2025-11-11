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
import java.util.List;

public class MainMovimentacaoSave {
    public static void main(String[] args) throws PersistenciaDawException {

        MovimentacaoDeEstoqueDAO movDAO = new MovimentacaoDAOImpl();
        IngredientesDAO ingDAO = new IngredientesDAOImpl();

        Ingredientes ingrediente1 = new Ingredientes();
        ingrediente1.setNome("Tomate");
        ingrediente1.setQuantidade(200);
        ingrediente1.setUnidadeDeMedida("g");
        ingDAO.save(ingrediente1);

        Ingredientes ingrediente2 = new Ingredientes();
        ingrediente2.setNome("Cebola");
        ingrediente2.setQuantidade(1);
        ingrediente2.setUnidadeDeMedida("kg");
        ingDAO.save(ingrediente2);

        List<Ingredientes> list = new ArrayList<>();
        list.add(ingrediente1);

        MovimentacaoDeEstoque movimentacaoDeEstoque = new MovimentacaoDeEstoque();
        MovimentacaoDeEstoque movimentacaoDeEstoque2 = new MovimentacaoDeEstoque();

        movimentacaoDeEstoque.setQuantidade(3);
        movimentacaoDeEstoque.setTipoDeMovimentacao("ENTRADA");
        movimentacaoDeEstoque.setDataCriacao(new Date());
        movimentacaoDeEstoque.setIngrediente(list);

        List<Ingredientes> list2 = new ArrayList<>();
        list2.add(ingrediente2);

        movimentacaoDeEstoque2.setQuantidade(1);
        movimentacaoDeEstoque2.setTipoDeMovimentacao("SAÍDA");
        movimentacaoDeEstoque2.setDataCriacao(new Date());
        movimentacaoDeEstoque2.setIngrediente(list2);

        movDAO.save(movimentacaoDeEstoque);
        movDAO.save(movimentacaoDeEstoque2);
    }
}