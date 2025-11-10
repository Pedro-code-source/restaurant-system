package br.edu.ifpb.es.daw.dao.impl;

import br.edu.ifpb.es.daw.dao.intefarcesDaos.UsuarioDAO;
import br.edu.ifpb.es.daw.entities.Usuario;
import br.edu.ifpb.es.daw.util.JPAUtil;

public class UsuarioDAOImpl extends AbstractDAOImpl<Usuario, Integer> implements UsuarioDAO {

    public UsuarioDAOImpl() {
        super(Usuario.class, JPAUtil.getEntityManagerFactory());
    }
}
