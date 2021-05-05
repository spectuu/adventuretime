package com.spectu.game.arma;

public class Espada extends Arma {


    public Espada() {

        super(15, 70, "Cuerpo a cuerpo");

    }

    public void atacar() {

        durabilidad = durabilidad - 2;

    }
}
