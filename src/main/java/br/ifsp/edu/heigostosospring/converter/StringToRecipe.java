package br.ifsp.edu.heigostosospring.converter;

import br.ifsp.edu.heigostosospring.domain.recipe.Recipe;
import br.ifsp.edu.heigostosospring.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToRecipe implements Converter<String, Recipe> {

    @Autowired
    private RecipeService recipeService;

    @Override
    public Recipe convert(String source) {
        if (source.isEmpty())
            return null;

        Integer id = Integer.valueOf(source);
        return recipeService.buscarPorId(id);
    }
}
