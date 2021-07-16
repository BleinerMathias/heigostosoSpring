package br.ifsp.edu.heigostosospring.service;

import br.ifsp.edu.heigostosospring.domain.dao.IngredientsDAO;
import br.ifsp.edu.heigostosospring.domain.dao.RecipeDAO;
import br.ifsp.edu.heigostosospring.domain.recipe.Ingredients;
import br.ifsp.edu.heigostosospring.domain.recipe.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService {

    @Autowired
    private IngredientsDAO dao;

    @Transactional(readOnly = false)
    @Override
    public void salvar(Ingredients ingredient) {
        dao.save(ingredient);
    }

    @Transactional(readOnly = false)
    @Override
    public void editar(Ingredients ingredient) {
        dao.update(ingredient);
    }

    @Transactional(readOnly = false)
    @Override
    public void excluir(Integer id) {
        dao.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public Ingredients buscarPorId(Integer id) {
        return dao.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Ingredients> buscarTodos() {
        return dao.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public List<Ingredients> buscarPorReceita(Integer id) {
        return dao.findByRecipe(id);
    }


}
