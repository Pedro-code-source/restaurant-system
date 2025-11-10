package br.edu.ifpb.es.daw.atividade2.mains.save;

import br.edu.ifpb.es.daw.entities.Garcom;
import br.edu.ifpb.es.daw.util.JPAUtil;
import jakarta.persistence.EntityManager;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.GarcomDAO;
import br.edu.ifpb.es.daw.dao.impl.GarcomDAOImpl;
import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.entities.Garcom;

public class MainGarcomSave {

    public static void main(String[] args) {
        // 1. Instanciar o DAO (Assumindo que GarcomDAO e GarcomDAOImpl existem)
        GarcomDAO garcomDAO = new GarcomDAOImpl();

        // 2. Instanciar e Preencher a entidade Garcom
        Garcom novoGarcom = new Garcom();

        // Preenchimento de Atributos Herdados de Usuario (@MappedSuperclass)
        novoGarcom.setEmail("garcom.joao@restaurant.com");
        novoGarcom.setSenha("servico123");

        // Preenchimento de Atributos Próprios de Garcom
        novoGarcom.setNome("João da Mesa");

        // Associações @OneToMany: 'pedidosAtendidos' é o lado inverso (mappedBy).
        // A coleção deve ser inicializada (se não estiver no construtor) e está vazia,
        // satisfazendo o '0' na relação 0:N. O preenchimento ocorre ao salvar PedidoPresencial.

        try {
            System.out.println("Iniciando a operação de salvar Garcom...");

            // 3. Chamar o método save do DAO
            garcomDAO.save(novoGarcom);

            System.out.println("✅ Garcom salvo com sucesso.");
            System.out.println("Detalhes: ID " + novoGarcom.getId() + ", Nome: " + novoGarcom.getNome());

        } catch (PersistenciaDawException e) {
            // Captura a exceção personalizada lançada pelo seu AbstractDAOImpl
            System.err.println(" Erro de Persistência ao salvar Garcom: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println(" Erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }
}