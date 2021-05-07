package com.spectu.game.arma;

import com.spectu.game.entidad.Jugador;

public class Arma {

    public int daño;
    public int durabilidad;
    public String tipoDeArma;
    public String nombreDelArma;


    public Arma(int daño, int durabilidad, String tipoDeArma, String nombreDelArma) {

        this.daño = daño;
        this.durabilidad = durabilidad;
        this.tipoDeArma = tipoDeArma;
        this.nombreDelArma = nombreDelArma;
    }
}

