package br.ifsp.edu.heigostosospring.domain.recipe;

import br.ifsp.edu.heigostosospring.domain.AbstractEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ingredientes")
public class Ingredients extends AbstractEntity<Integer> {

    @Column(nullable = false, length = 100)
    private String description;

    @ManyToOne
    @JoinColumn(name = "recipe_fk")
    private Recipe recipe;

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

