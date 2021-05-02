package com.spectu.game.objetos;

import com.spectu.game.entidades.Jugador;
import com.spectu.game.lugares.Lugar;

import java.awt.*;

public class Botequin extends Objeto{



    public Botequin() {

        super("Botequin", 2);

    }

    public void curar(Jugador jugador){

        if(jugador.vida == 100){

            cantidad = 0;

            return;
        }

        if(cantidad > 0){

            jugador.vida = jugador.vida+50;

            if(jugador.vida > 100+50 ){

                jugador.vida = 100;
            }
            cantidad = cantidad-1;


        }else if(cantidad == 0){

            System.out.println("No tienes botequines");
            return;
        }
    }

    public void numeroDeBotequines(){

        System.out.println("Tienes " + cantidad + " botequin[es]");
    }

}
