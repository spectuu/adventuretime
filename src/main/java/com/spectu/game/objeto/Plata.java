package com.spectu.game.objeto;

import com.spectu.game.arma.Hacha;

public class Plata extends Objeto{

    public Plata() {
        super("Plata", "Reparar el hacha", 2);

    }

    public void usarPlata(Hacha hacha){

        if (cantidad > 0) {

            hacha.durabilidad = hacha.durabilidad + 10;
            if(hacha.durabilidad > 100){
                hacha.durabilidad = 100;
                System.out.println("El hacha tiene un maximo de 100 de durabilidad");

            }else{

                System.out.println("El hacha se a reparado");
                System.out.println("Durabilidad hacha: " + hacha.durabilidad);
                cantidad = cantidad - 1;
            }

        } else if (cantidad <= 0) {

            System.out.println("No tienes plata para reparar el hacha, mina para conseguirlo");
        }
    }
}

