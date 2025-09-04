package com.tp2.password;

import org.junit.jupiter.api.Test;

import static com.tp2.password.PasswordValidator.isValid;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PasswordValidatorTest {
    @Test

    public void testPasswordLargoMenor(){

        assertEquals(true, isValid("abcDE4%6zhlS"));
    }

    @Test
    public void testLargoMinimo(){


        assertEquals(false, isValid("abcDEl%ozhlS"));

    }
    @Test

    public void testSinMayusculas(){

        assertEquals(false, isValid("abcde4%6zhls"));

    }
    @Test

    public void testSinMinusculas() {

        assertEquals(false, isValid("ABCDE4%6ZHLS"));
    }

    @Test

    public void testSinNumero(){

        assertEquals(false, isValid("abcDEl%pzhlS"));
    }

    @Test

    public void testSinSimbolo(){


        assertEquals(false, isValid("abcDE4k6zhlS"));

    }
    @Test

    public void testPasswordValidaConCaracterExtra(){

        assertEquals(true, isValid("abcDE4%6zhlSßß"));
    }

//    Missing tests:

}
