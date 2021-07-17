package br.ifsp.edu.heigostosospring.domain.dao;

import br.ifsp.edu.heigostosospring.domain.recipe.Recipe;
import br.ifsp.edu.heigostosospring.domain.user.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class RecipeDAOImpl extends AbstractDAO<Recipe, Integer> implements RecipeDAO {

    @Override
    public List<Recipe> findByUser(Integer id) {
        return findAll().stream().filter(recipe -> recipe.getUser().getId().toString().equals(id.toString()))
                .collect(Collectors.toList());
    }
}
