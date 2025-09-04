package com.tp2.stringcalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringCalculatorTest {

    // TODO: Replace these lines with your tests
    @Test
    void emptyString() {

        assertEquals(0, "");
    }

    @Test
    void SingleNumber() {
        assertEquals(1, "1");
    }

    @Test
    void TwoNumbers() {
        assertEquals(3, "1,2");
    }

    @Test
    void MultipleNumbers() {
        assertEquals(6, "1,2,3");
    }

    @Test
    void NewLine() {
        assertEquals(6, "1/n2,3");

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
