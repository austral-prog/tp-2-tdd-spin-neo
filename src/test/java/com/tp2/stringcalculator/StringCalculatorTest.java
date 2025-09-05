package com.tp2.stringcalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringCalculatorTest {

    // TODO: Replace these lines with your tests
    StringCalculator calc = new StringCalculator();
    @Test
    void emptyString() {

        assertEquals(0, calc.add(""));
    }

    @Test
    void SingleNumber() {
        assertEquals(1, calc.add("1"));
    }

    @Test
    void TwoNumbers() {
        assertEquals(3, calc.add("1,2"));
    }

    @Test
    void MultipleNumbers() {
        assertEquals(6, calc.add("1,2,3"));
    }

    @Test
    void NewLine() {
        StringCalculator calc = new StringCalculator();
        assertEquals(6, calc.add("1/n2,3"));

    }

    @Test
    void negativeNumbersShouldThrowException() {
        StringCalculator calc = new StringCalculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.add("1,-2,3");
        });
        assertEquals("No se permiten números negativos", exception.getMessage());
    }

}
