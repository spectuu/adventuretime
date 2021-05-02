package com.spectu.game.entidades;

import com.spectu.game.armas.Arma;

public class Jugador extends Entidad {
    public Arma armaActual;
    public int vida = 50;

    public Jugador(String nombre) {
        super(nombre, 50);
    }

    public void vidaActual(){

        System.out.println("Tu vida actual es " + vida);
    }


}
