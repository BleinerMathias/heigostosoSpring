package br.ifsp.edu.heigostosospring.domain.recipe;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public enum Rating {
    TASTY("Gostoso"),
    VERY_TASTY("Muito Gostoso");

    @ManyToOne
    @JoinColumn(name = "rating")
    private String type;

    Rating(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
