package com.spectu.game.entidades;

public class Jugador extends Entidad {

    int botequin = 5;

    public Jugador(String nombre) {
        super(nombre, 50);

    }

    public void vidaActual(){

        System.out.println("Tu vida actual es " + vida);
    }

    public void curar(){

        if(botequin > 0){

            botequin = botequin-1;

         vida = vida+50;

        }

        if(botequin == 0){

            System.out.println("No tienes botequines");
        }

         if(vida == 500){

         botequin = 0;

         }



    }


}
