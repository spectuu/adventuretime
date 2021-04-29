package com.spectu.game.entidades;

public class Jugador extends Entidad{


    public Jugador(String nombre, int vida) {
        super(nombre, 100);
    }

    public void vidaActual(){

        System.out.println("Tu vida actual es " + vida);
    }
}
