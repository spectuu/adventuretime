package com.spectu.game.entidades;

public class Monstruo extends Entidad {

    public int daño = 15;

    public Monstruo(int daño){
        super("Monstruo", 50);
        this.daño = daño;

    }

    public void atacarJugador(Jugador jugador){

        jugador.vida = jugador.vida-daño;

    }

}
