package com.tp2.stringcalculator;
import java.util.List;
import java.util.Arrays;


public class StringCalculator {


    public int add(String numbers) {
        int suma = 0;
        numbers = numbers.replace("/n",",");
        List<String> numero_lista = Arrays.asList(numbers.split(","));


        int largo_lista = numero_lista.size();

        for(int i = 0; i< largo_lista; i++){
            if (numero_lista.get(i)== ""){
                return  0;
            }
            int numero = Integer.parseInt(numero_lista.get(i));
            if(numero< 0){
                throw new IllegalArgumentException("No se permiten números negativos");
            }
            suma = suma + numero;

        }
        return suma;
    }
}
