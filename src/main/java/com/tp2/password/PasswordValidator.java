package com.tp2.password;

public class PasswordValidator {

    public static boolean isValid(String password) {
        int largo = password.length();

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneSimbolo = false;
        String simbolos = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        int largoLista = simbolos.length();

        if (largo <= 8) {
            return false;
        }

        for (int i = 0; i < largo; i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }
            if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            }
            if (Character.isDigit(c)) {
                tieneNumero = true;
            }

            for (int i4 = 0; i4 < largoLista; i4++) {
                char simbolo2 = simbolos.charAt(i4);
                if (c == simbolo2) {
                    tieneSimbolo = true;
                    break;
                }
            }
        }

        return tieneMayuscula && tieneMinuscula && tieneNumero && tieneSimbolo;
    }
}