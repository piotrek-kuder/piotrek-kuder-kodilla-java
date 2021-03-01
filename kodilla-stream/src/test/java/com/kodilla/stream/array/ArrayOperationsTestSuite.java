package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] array = {12, 3, -17, 36, 0, -5, 168, -111, 29, 50}; //16.5
        //When
        double expectedAverage = ArrayOperations.getAverage(array);
        //Then
        assertEquals(16.5, expectedAverage);
    }
}
