package br.ifsp.edu.heigostosospring.service;

import br.ifsp.edu.heigostosospring.domain.dao.UserDAO;
import br.ifsp.edu.heigostosospring.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO dao;

    @Transactional(readOnly = false)
    @Override
    public void salvar(User user) {
        dao.save(user);
    }

    @Transactional(readOnly = false)
    @Override
    public void editar(User user) {
        dao.update(user);
    }

    @Transactional(readOnly = false)
    @Override
    public void excluir(Integer id) {
        dao.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public User buscarPorId(Integer id) {
        return dao.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> buscarTodos() {
        return dao.findAll();
    }

}
