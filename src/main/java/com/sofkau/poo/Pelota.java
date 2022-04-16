package com.sofkau.poo;

public class Pelota {
    float radio;
    float peso;

    public Pelota(float radio, float peso){
        this.radio = radio;
        this.peso =peso;
    }

    public float obtenerPeso(){
        return this.peso;
    }

    public float obtenerRadio(){
        return this.radio;
    }

    public void patearPelota(){
        System.out.println("Haz pateado la pelota");
    }

    public void atraparPelota(){
        System.out.println("Haz atrapado la pelota");
    }
}

