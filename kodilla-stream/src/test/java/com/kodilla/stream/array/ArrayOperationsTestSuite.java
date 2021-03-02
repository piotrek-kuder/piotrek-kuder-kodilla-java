package com.kodilla.stream.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @DisplayName("getAverage full array")
    @Test
    void testGetAverage() {
        //Given
        int[] array = {12, 3, -17, 36, 0, -5, 168, -111, 29, 50}; //16.5
        //When
        double expectedAverage = ArrayOperations.getAverage(array);
        //Then
        assertEquals(16.5, expectedAverage);
    }
    @DisplayName("getAverage empty array")
    @Test
    void testGetAverageForEmptyArray() {
        //Given
        int[] array = {};
        //When
        double expectedAverage = ArrayOperations.getAverage(array);
        //Then
        assertEquals(0, expectedAverage);
    }
}
