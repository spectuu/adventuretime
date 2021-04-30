package com.spectu.game.entidades;

public class Monstruo extends Entidad {

    Jugador jugador = new Jugador(nombre);

    int daño = 15;

    public Monstruo(int daño){
        super("Monstruo", 50);

        this.daño = daño;

    }

    public void atacar(){

        daño = jugador.vida-daño;

    }
}
