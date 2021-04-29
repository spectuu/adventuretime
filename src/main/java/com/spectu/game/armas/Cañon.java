package com.spectu.game.armas;

public class Cañon extends Arma {

    public Cañon() {
        super(3, 3, 40);
    }

    @Override
    public void disparar(){

        balasActuales = balasActuales-1;

    }

    @Override
    public void recargar(){

        if(balasActuales == 0){

            balasActuales = balasActuales+cargador;
            
        }
    }
}
