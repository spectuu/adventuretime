package com.spectu.game.armas;


public class Arma {

    int balasActuales;
    int cargador;
    public int daño;

    public Arma(int balasActuales, int cargador, int daño) {
        this.balasActuales = balasActuales;
        this.cargador = cargador;
        this.daño = daño;
    }

    public void disparar() {

    }

    public void recargar() {

        if (balasActuales == 0) {


        }
    }

    public void balasActuales() {

        System.out.println("hay " + balasActuales + " bala[s]");

    }


}
