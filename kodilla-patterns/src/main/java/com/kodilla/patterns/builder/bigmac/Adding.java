package com.kodilla.patterns.builder.bigmac;

public enum Adding {
    LETTUCE("lettuce"),
    ONION("onion"),
    BECKON("beckon"),
    CUCUMBER("cucumber"),
    CHILIPEPPERS("chiliPeppers"),
    MUSHROOMS("mushrooms"),
    SHRIMPS("shrimps"),
    CHEESE("cheese");

    private String adding;

    Adding(String adding) {
        this.adding = adding;
    }

    public String getAdding() {
        return adding;
    }
}
