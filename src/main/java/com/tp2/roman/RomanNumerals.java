package com.tp2.roman;

public class RomanNumerals {

    public String convert(int number) {
        int num = number; // Usar el parámetro recibido

        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < valores.length; i++) {
            while (num >= valores[i]) {
                resultado.append(simbolos[i]);
                num -= valores[i]; // restar
            }
        }
        return resultado.toString();
    }

}
