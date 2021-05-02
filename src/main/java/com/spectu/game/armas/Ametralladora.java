package com.spectu.game.armas;

public class Ametralladora extends Arma {

    public Ametralladora() {
        super(30, 15, 5);
    }

    int recargar = 30;

    @Override
    public void disparar() {

        balasActuales = balasActuales-10;

    }

    @Override
    public void recargar() {

        if (balasActuales == 0) {

            balasActuales = balasActuales+recargar;
            System.out.println("El arma se esta recargando");

            cargador = cargador-1;
        }
        if(cargador == 0){

            balasActuales = 0;
            recargar = 0;
            System.out.println("No tienes cargadores");

        }
    }
}
