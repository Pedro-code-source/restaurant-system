package br.edu.ifpb.es.daw.atividade2.mains.delete;

import br.edu.ifpb.es.daw.dao.PersistenciaDawException;
import br.edu.ifpb.es.daw.dao.impl.MesaDAOImpl;
import br.edu.ifpb.es.daw.dao.intefarcesDaos.MesaDAO;
import br.edu.ifpb.es.daw.entities.Mesa;
import br.edu.ifpb.es.daw.entities.PedidoOnline;

import java.util.List;

public class MainMesaDeleteAll {
    public static void main(String[] args) throws PersistenciaDawException {
        MesaDAO mesaDAO = new MesaDAOImpl();
        List<Mesa> todos = mesaDAO.getAll();

        Mesa novaMesa = new Mesa();
        Mesa novaMesa2 = new Mesa();

        novaMesa.setNumero(10);
        novaMesa.setCapacidade(4);
        novaMesa.setStatus("LIVRE");

        novaMesa2.setNumero(2);
        novaMesa2.setCapacidade(8);
        novaMesa2.setStatus("OCUPADA");

        System.out.println("Encontradas " + todos.size() + " mesas para deletar.");

        for (Mesa c : todos) {
            mesaDAO.delete(c.getId());
        }

        List<Mesa> restantes = mesaDAO.getAll();
        System.out.println("Mesas restantes no banco: " + restantes.size());

    }
}
