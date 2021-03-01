package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        //creating countries
        Country country1 = new Country("country1", "123456789101010");
        Country country2 = new Country("country2", "123456789101020");
        Country country3 = new Country("country3", "123456789101030");
        Country country4 = new Country("country4", "223456789101040");
        Country country5 = new Country("country5", "123456789101050");
        Country country6 = new Country("country6", "423456789101060");
        Country country7 = new Country("country7", "123456789101070");
        Country country8 = new Country("country8", "323456789101080");
        Country country9 = new Country("country9", "123456789101090");
        //creating continents
        Continent continent1 = new Continent("continent1");
        Continent continent2 = new Continent("continent2");
        Continent continent3 = new Continent("continent3");
        //creating world
        World world = new World();

        //When
        //adding locations to sets

        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);
        continent1.addCountry(country4);

        continent2.addCountry(country5);
        continent2.addCountry(country6);
        continent2.addCountry(country7);

        continent3.addCountry(country8);
        continent3.addCountry(country9);

        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);

        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("1711111101909450");
        assertEquals(4, continent1.getCountrySet().size());
        assertEquals(3, continent2.getCountrySet().size());
        assertEquals(2, continent3.getCountrySet().size());
        assertEquals(3, world.getContinentSet().size());
        assertEquals(expectedPeopleQuantity, totalPeople);
    }
}
