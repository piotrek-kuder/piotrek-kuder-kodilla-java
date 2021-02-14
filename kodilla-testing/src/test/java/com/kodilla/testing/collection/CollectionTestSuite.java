package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.*;

@DisplayName("Collection testing suite")
public class CollectionTestSuite {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test suite: START");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("Test suite: END");
    }
    @BeforeEach
    public void beforeEach() {
        System.out.println("Test case: begin");
    }
    @AfterEach
    public void afterEach() {
        System.out.println("Test case: end");
    }

    @DisplayName("'exterminator' for empty list returns the same empty list")
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        Integer[] array = {};
        List<Integer> numbers = Arrays.asList(array);
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        //When
        int result = oddNumberExterminator.exterminate(numbers).size();
        //Then
        Assertions.assertEquals(0, result);
    }

    @DisplayName("'exterminator' for random Integer list returns the even numbers list")
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        Integer[] array = {2, 1, 33, 22, 5, 1, 1, -7, 0, 32};
        List<Integer> numbers = Arrays.asList(array);
        OddNumberExterminator oddNumberExterminator = new OddNumberExterminator();
        //When
        int result = oddNumberExterminator.exterminate(numbers).size();
        //Then
        Assertions.assertEquals(4, result);
    }

}
