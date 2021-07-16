package br.ifsp.edu.heigostosospring.domain.dao;

import br.ifsp.edu.heigostosospring.domain.recipe.Instructions;

import java.util.List;

public interface InstructionDAO {

    void save(Instructions instructions);
    void update(Instructions instructions);
    void delete(Integer id);

    Instructions findById(Integer id);

    List<Instructions> findAll();
    List<Instructions> findByRecipe(Integer id);

}
