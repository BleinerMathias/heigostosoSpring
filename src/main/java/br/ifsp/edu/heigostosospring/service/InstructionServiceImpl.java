package br.ifsp.edu.heigostosospring.service;

import br.ifsp.edu.heigostosospring.domain.dao.IngredientsDAO;
import br.ifsp.edu.heigostosospring.domain.dao.InstructionDAO;
import br.ifsp.edu.heigostosospring.domain.recipe.Ingredients;
import br.ifsp.edu.heigostosospring.domain.recipe.Instructions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InstructionServiceImpl implements InstructionsService {

    @Autowired
    private InstructionDAO dao;

    @Transactional(readOnly = false)
    @Override
    public void salvar(Instructions instructions) {
        dao.save(instructions);
    }

    @Transactional(readOnly = false)
    @Override
    public void editar(Instructions instructions) {
        dao.update(instructions);
    }

    @Transactional(readOnly = false)
    @Override
    public void excluir(Integer id) {
        dao.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public Instructions buscarPorId(Integer id) {
        return dao.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Instructions> buscarTodos() {
        return dao.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public List<Instructions> buscarPorReceita(Integer id) {
        return dao.findByRecipe(id);
    }


}
