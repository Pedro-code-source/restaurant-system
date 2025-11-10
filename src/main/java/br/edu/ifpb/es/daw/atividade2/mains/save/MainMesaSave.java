package br.edu.ifpb.es.daw.atividade2.mains.save;

import br.edu.ifpb.es.daw.entities.Mesa;
import br.edu.ifpb.es.daw.util.JPAUtil;
import jakarta.persistence.EntityManager;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.MesaDAO;
import br.edu.ifpb.es.daw.dao.impl.MesaDAOImpl;
import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.entities.Mesa;

public class MainMesaSave {
    public static void main(String[] args) {
        // 1. Instanciar o DAO (Assumindo que MesaDAO e MesaDAOImpl existem)
        MesaDAO mesaDAO = new MesaDAOImpl();

        // 2. Instanciar e Preencher a entidade Mesa
        Mesa novaMesa = new Mesa();

        // Preenchimento dos Atributos Simples
        novaMesa.setNumero(10);
        novaMesa.setCapacidade(4);
        novaMesa.setStatus("LIVRE"); // Ex: LIVRE, OCUPADA, RESERVADA

        // Relacionamentos @OneToMany: 'reservas' e 'pedidos' são o lado inverso (mappedBy).
        // As coleções podem estar vazias (satisfazendo o '0' da relação 0:N).
        // A associação será estabelecida ao salvar as entidades Reserva ou PedidoPresencial.

        try {
            System.out.println("Iniciando a operação de salvar Mesa...");

            // 3. Chamar o método save do DAO
            mesaDAO.save(novaMesa);

            System.out.println("✅ Mesa salva com sucesso.");
            System.out.println("Detalhes: ID " + novaMesa.getId() + ", Número: " + novaMesa.getNumero());

        } catch (PersistenciaDawException e) {
            // Captura a exceção personalizada lançada pelo seu AbstractDAOImpl
            System.err.println("❌ Erro de Persistência ao salvar Mesa: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("❌ Erro inesperado: " + e.getMessage());
            e.printStackTrace();
        }


    }
}