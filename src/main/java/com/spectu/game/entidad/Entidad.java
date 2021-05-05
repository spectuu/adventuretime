package com.spectu.game.entidad;

public class Entidad {

    public String nombre;
    public int vida;

    public Entidad(String nombre, int vida) {

        this.nombre = nombre;
        this.vida = vida;

    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }


}
