package br.ifsp.edu.heigostosospring.domain.recipe;

public enum Category {
    CAKES_AND_PIES("BOLOS E TORTAS"),
    MEAT("CARNES"),
    POULTRY("AVES"),
    FISHES_AND_SEA_FOOD("PEIXES E FRUTOS DO MAR"),
    SALADS_AND_SAUCES("SALADAS E MOLHOS"),
    SOUPS("SOPAS"),
    PASTAS("MASSAS"),
    DRINKS("BEBIDAS"),
    SWEETS_AND_DESSERTS("DOCES E SOBREMESAS"),
    SNACKS("LANCHES"),
    HEALTHY_EATING("ALIMENTAÇÃO SAUDÁVEL");

    private String description;

    Category(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
