package br.ifsp.edu.heigostosospring.service;

import br.ifsp.edu.heigostosospring.domain.recipe.Ingredients;


import java.util.List;

public interface IngredientService {

    void salvar(Ingredients ingredients);

    void editar(Ingredients ingredients);

    void excluir(Integer id);

    Ingredients buscarPorId(Integer id);

    List<Ingredients> buscarTodos();

    List<Ingredients> buscarPorReceita(Integer id);

}
