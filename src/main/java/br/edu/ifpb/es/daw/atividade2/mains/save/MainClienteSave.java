package br.edu.ifpb.es.daw.atividade2.mains.save;

import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.dao.impl.ClienteDAOImpl;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.ClienteDAO;
import br.edu.ifpb.es.daw.entities.Cliente;

public class MainClienteSave {
    public static void main(String[] args) throws PersistenciaDawException {
        Cliente novoCliente = new Cliente();

        ClienteDAO clienteDAO = new ClienteDAOImpl();


        novoCliente.setEmail("ana.carvalho@exemplo.com");
        novoCliente.setSenha("seguranca10");


        novoCliente.setNome("Ana de Carvalho");
        novoCliente.setTelefone(99991234);
        novoCliente.setEndereco("Avenida Principal, 456");


        try {
            System.out.println("Iniciando a operação de salvar cliente...");

            clienteDAO.save(novoCliente);

            System.out.println("Cliente salvo com sucesso.");
            System.out.println("Detalhes: ID " + novoCliente.getId() + ", Nome: " + novoCliente.getNome());

        } catch (Exception e) {
            System.err.println("Erro ao salvar Cliente usando DAO: " + e.getMessage());

            e.printStackTrace();
        }




    }
}