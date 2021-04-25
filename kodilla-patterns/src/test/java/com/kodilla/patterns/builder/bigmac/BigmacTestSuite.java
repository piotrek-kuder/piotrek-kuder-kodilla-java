package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("bun no sesam")
                .sauce("barbecue")
                .burgers(2)
                .ingredients(Ingredient.CHEESE).ingredients(Ingredient.CUCUMBER).ingredients(Ingredient.LETTUCE)
                .builder();
        //When
        int result = bigmac.getIngredients().size();
        //Then
        System.out.println(bigmac);
        assertEquals(3, result);
    }
}
