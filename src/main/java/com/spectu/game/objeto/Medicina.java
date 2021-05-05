package com.spectu.game.objeto;

import com.spectu.game.entidad.Jugador;

public class Medicina extends Objeto {


    public Medicina() {

        super("Vendas", "Curar un porcentaje de vida", 0);

    }

    public void curar(Jugador jugador) {

        if (jugador.vida > 100) {

            cantidad = 100-15;

            return;
        }

        if (cantidad > 0) {

            jugador.vida = jugador.vida + 15;
            System.out.println("Vida actual: " + jugador.vida);

            if (jugador.vida > 100) {

                jugador.vida = 100 - 10;

            }

            cantidad = cantidad - 1;

        } else if (cantidad <= 0) {

            cantidad = 0;

            System.out.println("no tienes vendas para curarte");
            return;

        }

    }
}
