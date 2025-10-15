import dao.ClienteDAO;
import entities.Cliente;

public class Main {
    public static void main(String[] args) {
        ClienteDAO dao = new ClienteDAO();
        Cliente cliente = new Cliente();
        cliente.setNome("maria");
        cliente.setEndereco("Rua Balbino do Carmo");
        cliente.setTelefone(85457681);
        dao.save(cliente);
        System.out.println(cliente.getId());
        cliente.setNome("Pedro");
        dao.update(cliente);
        System.out.println(cliente.getId());

    }
}
