package com.spectu.game.armas;

public class Escopeta extends Arma{

    public Escopeta() {

        super(15, 15, 30);

    }

    @Override
    public void disparar(){

        balasActuales = balasActuales-5;
    }

    @Override
    public void recargar(){

       if(balasActuales == 0){

           balasActuales = balasActuales+cargador;
       }
    }
}
