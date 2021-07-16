package br.ifsp.edu.heigostosospring.domain.dao;

import br.ifsp.edu.heigostosospring.domain.recipe.Ingredients;

import java.util.List;

public interface IngredientsDAO {

    void save(Ingredients ingredients);
    void update(Ingredients ingredients);
    void delete(Integer id);

    Ingredients findById(Integer id);

    List<Ingredients> findAll();
    List<Ingredients> findByRecipe(Integer id);

}
