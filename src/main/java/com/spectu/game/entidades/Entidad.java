package com.spectu.game.entidades;

import com.spectu.game.armas.Arma;

public class Entidad {



    String nombre;
    int vida;

    public Entidad(String nombre, int vida){

        this.vida = vida;
        this.nombre = nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {

        return nombre;

    }

}
