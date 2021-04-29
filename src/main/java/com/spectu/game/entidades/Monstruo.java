package com.spectu.game.entidades;

public class Monstruo extends Entidad {

    int daño = 15;


    public Monstruo(int daño, int vida){
        super("Monstruo", vida);
        this.daño = daño;

    }
}
