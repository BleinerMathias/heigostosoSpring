package br.ifsp.edu.heigostosospring.service;

import br.ifsp.edu.heigostosospring.domain.recipe.Recipe;

import java.util.List;

public interface RecipeService {

    void salvar(Recipe recipe);

    void editar(Recipe recipe);

    void excluir(Integer id);

    Recipe buscarPorId(Integer id);

    List<Recipe> buscarTodos();

    List<Recipe> findByUser(Integer id);

}
