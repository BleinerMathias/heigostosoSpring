package br.ifsp.edu.heigostosospring.domain.dao;

import br.ifsp.edu.heigostosospring.domain.recipe.Comment;
import br.ifsp.edu.heigostosospring.domain.recipe.Recipe;
import br.ifsp.edu.heigostosospring.domain.user.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;


@Repository
public class CommentDAOImp extends AbstractDAO<Comment, Integer> implements CommentDAO {
    @Override
    public List<Comment> findByRecipe(Integer id) {
        return findAll().stream().filter(comment -> comment.getRecipe().getId().toString().equals(id.toString()))
                .collect(Collectors.toList());
    }
}

