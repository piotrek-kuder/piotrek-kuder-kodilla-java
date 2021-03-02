package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String countryName;
    private BigDecimal peopleQuantity;

    public Country(final String name, final String  population) {
        this.countryName = name;
        this.peopleQuantity = new BigDecimal(population);
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
