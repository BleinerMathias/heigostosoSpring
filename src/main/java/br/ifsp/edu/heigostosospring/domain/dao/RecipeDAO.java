package br.ifsp.edu.heigostosospring.domain.dao;

import br.ifsp.edu.heigostosospring.domain.recipe.Recipe;

import java.util.List;

public interface RecipeDAO {

    void save(Recipe recipe);
    void update(Recipe recipe);
    void delete(Integer id);

    Recipe findById(Integer id);

    List<Recipe> findAll();

}
