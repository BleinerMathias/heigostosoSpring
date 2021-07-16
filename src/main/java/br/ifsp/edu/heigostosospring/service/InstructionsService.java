package br.ifsp.edu.heigostosospring.service;

import br.ifsp.edu.heigostosospring.domain.recipe.Ingredients;
import br.ifsp.edu.heigostosospring.domain.recipe.Instructions;

import java.util.List;

public interface InstructionsService {

    void salvar(Instructions instructions);

    void editar(Instructions instructions);

    void excluir(Integer id);

    Instructions buscarPorId(Integer id);

    List<Instructions> buscarTodos();

    List<Instructions> buscarPorReceita(Integer id);

}
