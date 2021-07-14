package br.ifsp.edu.heigostosospring.domain.recipe;

import br.ifsp.edu.heigostosospring.domain.AbstractEntity;

import javax.persistence.*;

@Entity
@Table(name = "instructions")
public class Instructions extends AbstractEntity<Integer> {

    @Column(nullable = false, unique = true)
    private Integer step;

    @ManyToOne
    @JoinColumn(name = "recipe_instruction_fk")
    private Recipe recipe;

    @Column(nullable = false)
    private String description;

    public Integer getStep() {
        return step;
    }

    public void setStep(Integer step) {
        this.step = step;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
