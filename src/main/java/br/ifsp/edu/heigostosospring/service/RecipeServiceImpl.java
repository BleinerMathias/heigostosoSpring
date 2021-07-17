package br.ifsp.edu.heigostosospring.service;

import br.ifsp.edu.heigostosospring.domain.dao.RecipeDAO;
import br.ifsp.edu.heigostosospring.domain.recipe.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeDAO dao;

    @Transactional(readOnly = false)
    @Override
    public void salvar(Recipe recipe) {
        dao.save(recipe);
    }

    @Transactional(readOnly = false)
    @Override
    public void editar(Recipe recipe) {
        dao.update(recipe);
    }

    @Transactional(readOnly = false)
    @Override
    public void excluir(Integer id) {
        dao.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public Recipe buscarPorId(Integer id) {
        return dao.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Recipe> buscarTodos() {
        return dao.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public List<Recipe> findByUser(Integer id)  { return  dao.findByUser(id);}

}
