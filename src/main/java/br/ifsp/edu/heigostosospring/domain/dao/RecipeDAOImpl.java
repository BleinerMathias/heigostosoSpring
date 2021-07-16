package br.ifsp.edu.heigostosospring.domain.dao;

import br.ifsp.edu.heigostosospring.domain.recipe.Recipe;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeDAOImpl extends AbstractDAO<Recipe, Integer> implements RecipeDAO {
}
