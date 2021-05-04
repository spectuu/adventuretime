package com.spectu.game.objeto;

import com.spectu.game.arma.Espada;

public class Hierro extends Objeto{


    public Hierro() {

        super("Hierro", "Reparar la espada", 5);

    }

    public void usarHierro(Espada espada){

        if(cantidad > 0){

            if(espada.durabilidad >= 100){

                espada.durabilidad = espada.durabilidad-10;

            }

            espada.durabilidad = espada.durabilidad+10;
            System.out.println("La espada se a reparado");
            System.out.println("Durabilidad espada: " + espada.durabilidad);
            cantidad = cantidad-1;


        }else if(cantidad == 0){

            System.out.println("No tienes hierro para reparar la espada, mina para conseguirlo");
        }



    }

}
