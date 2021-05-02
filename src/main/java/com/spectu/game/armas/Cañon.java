package com.spectu.game.armas;

public class Cañon extends Arma {

    public Cañon() {
        super(3, 15, 40);
    }

    int recargar = 15;

    @Override
    public void disparar(){

        balasActuales = balasActuales-1;

    }

    @Override
    public void recargar(){

        if(balasActuales == 0){

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
