package com.sofkau.poo;

public class Main {
    public static void main(String[] args) {
        Pelota pelota = new Pelota(10,4);
        float peso =pelota.obtenerPeso();
        System.out.println("peso = " + peso);
        pelota.patearPelota();

    }
}
