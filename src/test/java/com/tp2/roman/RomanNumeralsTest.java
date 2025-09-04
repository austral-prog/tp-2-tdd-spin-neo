package com.tp2.roman;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {

    RomanNumerals converter = new RomanNumerals();

    @Test
    void TestUno(){
        assertEquals("I", converter.convert(1));
    }

    @Test
    void TestCinco(){
        assertEquals("V", converter.convert(5));
    }

    @Test
    void TestDiez(){
        assertEquals("X", converter.convert(10));
    }

    @Test
    void TestCuatro(){
        assertEquals("IV", converter.convert(4));
    }

    @Test
    void TestNueve(){
        assertEquals("IX", converter.convert(9));
    }

    @Test
    void TestCuarenta(){
        assertEquals("XL", converter.convert(40));
    }

    @Test
    void TestCincuenta(){
        assertEquals("L", converter.convert(50));
    }

    @Test
    void TestNoventa(){
        assertEquals("XC", converter.convert(90));
    }

    @Test
    void TestCien(){
        assertEquals("C", converter.convert(100));
    }

    @Test
    void Test400(){
        assertEquals("CD", converter.convert(400));
    }

    @Test
    void Test500(){
        assertEquals("D", converter.convert(500));
    }

    @Test
    void Test900(){
        assertEquals("CM", converter.convert(900));
    }

    @Test
    void Test1000(){
        assertEquals("M", converter.convert(1000));
    }

    @Test
    void Complex(){
        assertEquals("MCMXCIV", converter.convert(1994));
    }
}
