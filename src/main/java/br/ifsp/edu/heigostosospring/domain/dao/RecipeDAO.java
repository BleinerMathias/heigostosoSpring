package br.ifsp.edu.heigostosospring.domain.dao;

import br.ifsp.edu.heigostosospring.domain.recipe.Recipe;
import br.ifsp.edu.heigostosospring.domain.user.User;

import java.util.List;

public interface RecipeDAO {

    void save(Recipe recipe);
    void update(Recipe recipe);
    void delete(Integer id);

    Recipe findById(Integer id);

    List<Recipe> findAll();

    List<Recipe> findByUser(Integer id);

}
