package com.spectu.game.entidad;

import com.spectu.game.arma.Arma;

public class Jugador extends Entidad{

    public Arma armaActual;

    public Jugador(String nombre) {
        super(nombre, 50);

    }

    public void vidaActual(){

        System.out.println("Vida Actual: " + vida);
        
    }


}
