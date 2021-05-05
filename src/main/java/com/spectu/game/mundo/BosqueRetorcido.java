package com.spectu.game.mundo;

import com.spectu.game.ScannerWrapper;
import com.spectu.game.entidad.Fantasma;
import com.spectu.game.entidad.Jugador;
import com.spectu.game.entidad.SoldadoDeLaRuina;
import com.spectu.game.objeto.Hierro;
import com.spectu.game.objeto.Medicina;
import com.spectu.game.objeto.Plata;

import java.util.concurrent.ThreadLocalRandom;

public class BosqueRetorcido {

    private ScannerWrapper scanner;

    public void explorar(Medicina vendas, Jugador jugador, Hierro hierro, Plata plata) {

        if (jugador.armaActual == null) {

            System.out.println("Antes de explorar selecciona un arma");
        } else {

            scanner = new ScannerWrapper();

            int vendasObtenidas = ThreadLocalRandom.current().nextInt(1, 3 + 1);
            int probabilidadVendas = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            int probabilidadEnemigo = ThreadLocalRandom.current().nextInt(1, 100 + 1);

            if (probabilidadVendas > 50) {

                vendas.cantidad = vendasObtenidas + vendas.cantidad;

                System.out.println("Has obtenido [" + vendasObtenidas + "] venda[s].");

            } else {

                System.out.println("no as obtenido nada mejor suerte para la proxima :b");

            }

            if(probabilidadEnemigo < 50 && probabilidadEnemigo > 1){

                jugador.pelear(hierro, vendas, jugador, plata);

            }

        }
    }

}
