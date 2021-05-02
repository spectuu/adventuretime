package com.spectu.game.armas;


public class Arma {

   public int balasActuales;
   public int cargador;
   public int recargar;
   public int gastoDeBalas;
   public int daño;

    public Arma(int balasActuales, int cargador, int daño, int recargar, int gastoDeBalas) {

        this.balasActuales = balasActuales;
        this.cargador = cargador;
        this.recargar = recargar;
        this.gastoDeBalas = gastoDeBalas;
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
