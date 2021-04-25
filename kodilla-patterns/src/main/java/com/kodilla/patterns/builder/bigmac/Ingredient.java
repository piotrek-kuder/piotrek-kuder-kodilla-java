package com.kodilla.patterns.builder.bigmac;

public enum Ingredient {
    LETTUCE("lettuce"),
    ONION("onion"),
    BECKON("beckon"),
    CUCUMBER("cucumber"),
    CHILIPEPPERS("chiliPeppers"),
    MUSHROOMS("mushrooms"),
    SHRIMPS("shrimps"),
    CHEESE("cheese");

    private String ingredient;

    Ingredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getIngredient() {
        return ingredient;
    }
}
