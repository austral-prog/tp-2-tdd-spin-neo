package com.tp2.stringcalculator;
import java.util.List;
import java.util.Arrays;


public class StringCalculator {

    int suma = 0;

    public int add(String numbers) {

        List<String> numero_lista = Arrays.asList(numbers.split(","));

        int largo_lista = numero_lista.size();

        for(int i = 0; i< largo_lista; i++){

            int numero = Integer.parseInt(numero_lista.get(i));
            if(numero< 0){
                throw new IllegalArgumentException("No se permiten números negativos");
            }
            suma = suma + numero;

        }
        return suma;
    }
}
