package com.sofkau.fundamentouno.ejercicios;

public class Fibonacci {
    public static void main(String[] args) {
        int numero = 1;
        int anterior =0;
        int temp;
        while (true){
            System.out.println(numero);
            temp =numero;
            numero = numero + anterior;
            anterior = temp;
            if(numero>30){
                break;
            }
        }
    }
}
