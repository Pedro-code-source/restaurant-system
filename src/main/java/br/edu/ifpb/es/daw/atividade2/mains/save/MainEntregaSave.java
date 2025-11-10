package br.edu.ifpb.es.daw.atividade2.mains.save;

import br.edu.ifpb.es.daw.entities.Entrega;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.EntregaDAO;
import br.edu.ifpb.es.daw.dao.impl.EntregaDAOImpl;
import br.edu.ifpb.es.daw.dao.PersistenciaDawException; // Importar a exceção personalizada


public class MainEntregaSave {
    public static void main(String[] args) {
        // 1. Instanciar o DAO (deve ser criado separadamente, como no exemplo anterior)
        EntregaDAO entregaDAO = new EntregaDAOImpl();

        // 2. Instanciar e Preencher a entidade Entrega
        Entrega novaEntrega = new Entrega();

        // Preenchimento dos Atributos Simples
        novaEntrega.setNomeEntregador("Maria Entregadora");
        novaEntrega.setTelefoneEntregador(99876543);

        // Relacionamento @OneToOne(mappedBy="entrega"):
        // Não precisamos configurar o PedidoOnline aqui, pois Entrega é o lado inverso (mappedBy).
        // A chave estrangeira será setada na tabela PedidoOnline quando ele for salvo.

        try {
            System.out.println("Iniciando a operação de salvar Entrega...");

            // 3. Chamar o método save do DAO
            // O AbstractDAOImpl gerencia a abertura e fechamento do EntityManager e a transação.
            entregaDAO.save(novaEntrega);

            System.out.println("Entrega salva com sucesso.");
            System.out.println("Detalhes: ID " + novaEntrega.getId() + ", Responsável: " + novaEntrega.getNomeEntregador());

        } catch (PersistenciaDawException e) {
            // Captura a exceção personalizada lançada pelo seu AbstractDAOImpl
            System.err.println("Erro de Persistência ao salvar Entrega: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }


    }
}