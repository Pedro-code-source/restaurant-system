package br.edu.ifpb.es.daw.atividade2.mains.save;

import br.edu.ifpb.es.daw.entities.Ingredientes;
import br.edu.ifpb.es.daw.util.JPAUtil;
import jakarta.persistence.EntityManager;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.IngredientesDAO;
import br.edu.ifpb.es.daw.dao.impl.IngredientesDAOImpl;
import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.entities.Ingredientes;
// Nota: Não precisamos de MovimentacaoDeEstoque aqui para salvar Ingredientes.

public class MainIngredientesSave {
    public static void main(String[] args) {
        // 1. Instanciar o DAO
        IngredientesDAO ingredientesDAO = new IngredientesDAOImpl();

        // 2. Instanciar e Preencher a entidade Ingredientes
        Ingredientes novoIngrediente = new Ingredientes();

        // Preenchimento dos Atributos Simples
        novoIngrediente.setNome("Farinha de Trigo");
        novoIngrediente.setQuantidade(5000);
        novoIngrediente.setUnidadeDeMedida("g");

        // Relacionamento @ManyToMany: 'movimentacoes' é o lado inverso (mappedBy).
        // A coleção deve ser inicializada (se não estiver no construtor) e pode estar vazia.
        // O preenchimento da tabela de associação ocorrerá ao salvar a MovimentacaoDeEstoque.

        try {
            System.out.println("Iniciando a operação de salvar Ingrediente...");

            // 3. Chamar o método save do DAO
            // O AbstractDAOImpl gerencia a abertura e fechamento do EntityManager e a transação.
            ingredientesDAO.save(novoIngrediente);

            System.out.println("✅ Ingrediente salvo com sucesso.");
            System.out.println("Detalhes: ID " + novoIngrediente.getId() + ", Nome: " + novoIngrediente.getNome());

        } catch (PersistenciaDawException e) {
            // Captura a exceção personalizada lançada pelo seu AbstractDAOImpl
            System.err.println("❌ Erro de Persistência ao salvar Ingrediente: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("❌ Erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }


    }
}