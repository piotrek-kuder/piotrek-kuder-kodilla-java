package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testAdd() {
        //Given
        //When
        double result = calculator.add(12.5, -10.9);
        //Then
        assertEquals(1.6, result, 0.001);
    }

    @Test
    void testSub() {
        //Given
        //When
        double result = calculator.sub(10.33, 5.99);
        //Then
        assertEquals(4.34, result, 0.001);
    }

    @Test
    void testMul() {
        //Given
        //When
        double result = calculator.mul(10.33, 5.99);
        //Then
        assertEquals(61.877, result, 0.001);
    }

    @Test
    void testDiv() {
        //Given
        //When
        double result = calculator.div(10.33, 5.99);
        //Then
        assertEquals(1.725, result, 0.001);
    }

    @Test
    void testDivByZero() {
        //Given
        //When
        double result = calculator.div(10.33, 0);
        //Then
        assertEquals(0, result, 0.001);
    }
}
