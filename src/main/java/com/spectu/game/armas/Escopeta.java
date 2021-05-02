package com.spectu.game.armas;

public class Escopeta extends Arma{

    int recargar = 15;

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
