package com.devopslab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void shouldAddTwoNumbers() {
        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    void shouldSubtractTwoNumbers() {
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        assertEquals(50, calculator.multiply(10, 5));
    }

    @Test
    void shouldDivideTwoNumbers() {
        assertEquals(2.0, calculator.divide(10, 5), 0.0001);
    }

    @Test
    void shouldRejectDivisionByZero() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(10, 0));
    }
}
