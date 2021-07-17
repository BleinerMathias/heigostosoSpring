package br.ifsp.edu.heigostosospring.domain.dao;

import br.ifsp.edu.heigostosospring.domain.recipe.Comment;

import java.util.List;

public interface CommentDAO {

    void save(Comment comment);
    void update(Comment comment);
    void delete(Integer id);

    Comment findById(Integer id);

    List<Comment> findAll();
    List<Comment> findByRecipe(Integer id);


}
