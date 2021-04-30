package com.spectu.game.entidades;

import com.spectu.game.armas.Arma;

public class Jugador extends Entidad {

    public int botequin = 5;
    public Arma armaActual;

    public Jugador(String nombre, int vida) {
        super(nombre, vida);

    }

    public void vidaActual(){

        System.out.println("Tu vida actual es " + vida);
    }

    public void curar(){

        if(botequin > 0){

            vida = vida+50;
            botequin = botequin-1;


        }else if(botequin == 0){

            System.out.println("No tienes botequines");
            return;
        }

         if(vida == 100){

         botequin = 0;
         return;
         }



    }


}
