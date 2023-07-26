package com.example.calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private final int a = 2;
    private final int b = 3;

    @BeforeClass
    public static void beforeClassStartTestTime() {
        System.out.println("Test class has been started at: " + System.currentTimeMillis());
    }

    @AfterClass
    public static void afterClassStartTestTime() {
        System.out.println("Test class has been finished at: " + System.currentTimeMillis());
    }

    @Before
    public void beforeStartTestTime() {
        System.out.println("Test has been started at: " + System.currentTimeMillis());
    }

    @After
    public void afterStartTestTime() {
        System.out.println("Test has been finished at: " + System.currentTimeMillis());
    }

    @Test
    public void testAddition() {
        // Given
        Calculator calculator = new Calculator();

        // When
        int result = calculator.add(a, b);

        // Then
        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    public void testSubtraction() {
        // Given
        Calculator calculator = new Calculator();

        // When
        int result = calculator.subtract(a, b);

        // Then
        int expected = -1;
        assertEquals(expected, result);
    }

    @Test
    public void testMultiplication() {
        // Given
        Calculator calculator = new Calculator();

        // When
        int result = calculator.multiply(a, b);

        // Then
        int expected = 6;
        assertEquals(expected, result);
    }

    @Test
    public void testDivision() {
        // Given
        Calculator calculator = new Calculator();

        // When
        double result = calculator.divide(a, b);

        // Then
        double expected = 0.67;
        assertEquals(expected, result, 1);
    }
}
