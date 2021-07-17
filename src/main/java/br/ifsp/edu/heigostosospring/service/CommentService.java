package br.ifsp.edu.heigostosospring.service;

import br.ifsp.edu.heigostosospring.domain.recipe.Comment;

import java.util.List;

public interface CommentService {

    void salvar(Comment comment);

    void editar(Comment comment);

    void excluir(Integer id);

    Comment buscarPorId(Integer id);

    List<Comment> buscarTodos();
    List<Comment> findByRecipe(Integer id);


}
