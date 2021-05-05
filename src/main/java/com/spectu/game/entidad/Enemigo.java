package com.spectu.game.entidad;

public class Enemigo extends Entidad{

    public int daño;

    public Enemigo(String nombre, int vida, int daño) {
        super(nombre, vida);
        this.daño = daño;
    }

    }

