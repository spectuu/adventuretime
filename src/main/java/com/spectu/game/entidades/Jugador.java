package com.spectu.game.entidades;

import com.spectu.game.armas.Arma;

public class Jugador extends Entidad {

    public int botequin = 5;
    public Arma armaActual;
    public int vida = 100;

    public Jugador(String nombre) {
        super(nombre, 100);
    }

    public void vidaActual(){

        System.out.println("Tu vida actual es " + vida);
    }

    public void curar(){

        if(vida == 100){

            botequin = 0;

            return;
        }

        if(botequin > 0){

            vida = vida+50;

            if(vida > 100+50 ){

                vida = 100;
            }
            botequin = botequin-1;


        }else if(botequin == 0){

            System.out.println("No tienes botequines");
            return;
        }


    }


}
