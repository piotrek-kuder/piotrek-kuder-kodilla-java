package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bigmac {
    private final String bun;
    private final String sauce;
    private final int burgers;
    private List<Adding> ingredients;

    private Bigmac(String bun, String sauce, int burgers, List<Adding> ingredients) {
        this.bun = bun;
        this.sauce = sauce;
        this.burgers = burgers;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public static class BigmacBuilder {
        private String bun;
        private String sauce;
        private int burgers;
        private List<Adding> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder ingredients(Adding ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public Bigmac builder() {
            return new Bigmac(bun, sauce, burgers, ingredients);
        }
    }

    public String getBun() {
        return bun;
    }

    public String getSauce() {
        return sauce;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<Adding> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {

        String adding = ingredients.stream().map(s -> s.getAdding()).collect(Collectors.joining(", ","","'"));

        return "Bigmac ingredients:" +
                "\nbun = '" + bun + '\'' +
                "\nsauce = '" + sauce + '\'' +
                "\nburgers = " + burgers + "" +
                "\nadding= '" + adding;
    }
}
