package com.spectu.game.entidades;

public class Monstruo extends Entidad{



    int daño = 15;

    public Monstruo(String nombre, int vida, int daño) {
        super("Monstruo", 100);
        this.daño = daño;

    }

    public void atacar(){


    }

}
