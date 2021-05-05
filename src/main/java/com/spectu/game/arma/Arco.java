package com.spectu.game.arma;

public class Arco extends Arma {

    int flechaActual = 1;
    int gastoFlecha = 1;
    int cargaFlecha = 2;

    public Arco() {
        super(20, 100, "Distancia");

    }

    public void atacar() {

        if (flechaActual >= gastoFlecha) {

            flechaActual = flechaActual - gastoFlecha;
            durabilidad = durabilidad - 2;
        } else {

            System.out.println("Antes carga la flecha");

        }

    }

    public void recargar() {

        if (cargaFlecha <= 0) {

            System.out.println("No tienes cargadores");


        } else {

            flechaActual = flechaActual + cargaFlecha;
            System.out.println("El arma se esta recargando");

            cargaFlecha = cargaFlecha - 1;
        }
    }
}
