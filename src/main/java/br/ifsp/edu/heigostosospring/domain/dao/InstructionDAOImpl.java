package br.ifsp.edu.heigostosospring.domain.dao;

import br.ifsp.edu.heigostosospring.domain.recipe.Ingredients;
import br.ifsp.edu.heigostosospring.domain.recipe.Instructions;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstructionDAOImpl extends AbstractDAO<Instructions, Integer> implements InstructionDAO {

}
