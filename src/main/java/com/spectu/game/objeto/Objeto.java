package com.spectu.game.objeto;

import com.spectu.game.arma.Arma;

public class Objeto {

    public String tipoDeObjeto;
    public String Funcion;
    public static int cantidad;

    public Objeto(String tipoDeObjeto, String funcion, int cantidad) {

        this.cantidad = cantidad;
        this.tipoDeObjeto = tipoDeObjeto;
        this.Funcion = funcion;

    }

    public void usarObjeto(Arma arma) {

        if (cantidad > 0) {

            arma.durabilidad = arma.durabilidad + 10;
            if (arma.durabilidad > 100) {
                arma.durabilidad = 100;
                System.out.println("Durabilidad: " + arma.durabilidad);
                System.out.println("El max de durabilidad es 100.");
            } else {

                System.out.println("El arma se ha reparado.");
                System.out.println("Durabilidad: " + arma.durabilidad);
                cantidad = cantidad - 1;
            }

        } else if (cantidad <= 0) {

            System.out.println("No tienes suficiente material para reparar el arma seleccionada.");
        }
    }

    public int getCantidad() {

        return cantidad;
    }

}
