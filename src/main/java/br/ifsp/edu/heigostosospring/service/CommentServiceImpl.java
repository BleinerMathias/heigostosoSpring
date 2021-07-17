package br.ifsp.edu.heigostosospring.service;

import br.ifsp.edu.heigostosospring.domain.dao.CommentDAO;
import br.ifsp.edu.heigostosospring.domain.dao.UserDAO;
import br.ifsp.edu.heigostosospring.domain.recipe.Comment;
import br.ifsp.edu.heigostosospring.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentDAO dao;

    @Transactional(readOnly = false)
    @Override
    public void salvar(Comment user) {
        dao.save(user);
    }

    @Transactional(readOnly = false)
    @Override
    public void editar(Comment user) {
        dao.update(user);
    }

    @Transactional(readOnly = false)
    @Override
    public void excluir(Integer id) {
        dao.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public Comment buscarPorId(Integer id) {
        return dao.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Comment> buscarTodos() {
        return dao.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public List<Comment> findByRecipe(Integer id) {
        return dao.findByRecipe(id);
    }

}
