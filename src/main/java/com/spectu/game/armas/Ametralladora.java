package com.spectu.game.armas;

public class Ametralladora extends Arma {

    public Ametralladora() {
        super(0, 3, 5, 30, 10);
    }



    @Override
    public void disparar() {

        if(balasActuales >= gastoDeBalas) {
            balasActuales = balasActuales-gastoDeBalas;
        }else {
            System.out.println("Antes tienes que recargar");
        }

    }

    @Override
    public void recargar() {

        if(cargador <= 0){

            System.out.println("No tienes cargadores");


        } else {

            balasActuales = balasActuales+recargar;
            System.out.println("El arma se esta recargando");

            cargador = cargador-1;

        }

    }
}
