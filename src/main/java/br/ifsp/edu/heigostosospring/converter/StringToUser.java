package br.ifsp.edu.heigostosospring.converter;

import br.ifsp.edu.heigostosospring.domain.recipe.Recipe;
import br.ifsp.edu.heigostosospring.domain.user.User;
import br.ifsp.edu.heigostosospring.service.RecipeService;
import br.ifsp.edu.heigostosospring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToUser implements Converter<String, User> {

    @Autowired
    private UserService userService;

    @Override
    public User convert(String source) {
        if (source.isEmpty())
            return null;

        Integer id = Integer.valueOf(source);
        return userService.buscarPorId(id);
    }
}
