package com.sofkau.fundamentouno.variables;

public class Main {
    //Variables y operaciones aritmeticas
    /**
     * short - numeros cortos
     * int - numeros enteros
     * long - numero enteros largos
     * float - numeros flotantes
     * double - numeros dobles
     * byte - se maneja en bytes
     * char - caracteres
     * boolean - boleanos, verdaderos o falsos
     * String - cadenas de texto
     * +-* / %
     * */
    public static void main(String[] args) {
       short suma;
       suma = 3 +10;
       int resta = 8 -17;
       long residuo =9/2;
       float multiplicacion = 2*(15*(-2));
       double division = 10/3.4;

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado de la divicion es: " + division);
        System.out.println("El residuo de la divicion es" + residuo);

               }
}
