package com.tp2.password;

public class PasswordValidator {
    String password = "";


    public static boolean isValid(String password) {
        int largo = password.length();

        boolean largoSuficiente = false;
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneSimbolo = false;
        String simbolos = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        int largoLista = simbolos.length();

        if (largo > 8) {
            largoSuficiente = true;
            }

        for(int i = 0; i< largo;i++) {
            char c = password.charAt((i));

            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }
            if (Character.isLowerCase(c) ){
                tieneMinuscula= true;
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
            if (tieneMayuscula && tieneMinuscula  && tieneNumero && tieneSimbolo){

                 return true;
            } else {
                return false;
        }

    }
}