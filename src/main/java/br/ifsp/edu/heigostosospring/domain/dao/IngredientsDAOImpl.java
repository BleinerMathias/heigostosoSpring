package br.ifsp.edu.heigostosospring.domain.dao;

import br.ifsp.edu.heigostosospring.domain.recipe.Ingredients;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IngredientsDAOImpl extends AbstractDAO<Ingredients, Integer> implements IngredientsDAO {

}
