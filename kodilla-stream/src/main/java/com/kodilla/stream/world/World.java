package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {
    private Set<Continent> continentSet = new HashSet<>();

    public void addContinent(Continent continent) {
        continentSet.add(continent);
    }

    public Set<Continent> getContinentSet() {
        return continentSet;
    }

    public BigDecimal getPeopleQuantity() {
        return continentSet.stream().flatMap(continent -> continent.getCountrySet().stream())
                .map(Country::getPeopleQuantity).reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
    }
}
