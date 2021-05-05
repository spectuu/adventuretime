package com.spectu.game.arma;

public class Hacha extends Arma {

    public Hacha() {

        super(35, 100, "distancia media");

    }

    public void atacar() {


        durabilidad = durabilidad - 2;

    }


}
