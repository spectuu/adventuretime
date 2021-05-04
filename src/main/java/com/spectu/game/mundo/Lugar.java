package com.spectu.game.mundo;

import com.spectu.game.ScannerWrapper;
import com.spectu.game.entidad.Fantasma;
import com.spectu.game.entidad.Jugador;
import com.spectu.game.objeto.Hierro;
import com.spectu.game.objeto.Medicina;

import java.util.concurrent.ThreadLocalRandom;

public class Lugar {

    private ScannerWrapper scanner;
    
    public void explorar(Medicina vendas, Jugador jugador){

        if(jugador.armaActual == null){

            System.out.println("Antes de explorar selecciona un arma");
        }else{

            scanner = new ScannerWrapper();

            int vendasObtenidas = ThreadLocalRandom.current().nextInt(1, 3 + 1);
            int probabilidadVendas = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            int probabilidadEnemigo = ThreadLocalRandom.current().nextInt(1, 100 + 1);

            if(probabilidadVendas < 50){

                vendas.cantidad = vendasObtenidas+vendas.cantidad;

                System.out.println("Has obtenido [" + vendasObtenidas + "] venda[s].");

            }else{

                System.out.println("no as obtenido nada mejor suerte para la proxima :b");

            }

            if(probabilidadEnemigo < 30){

                Fantasma fantasma = new Fantasma();

                System.out.println("¡ALERTA DE ENEMIGO!");
                System.out.println("FANTASMA:");
                System.out.println("vida: " + fantasma.vida);
                System.out.println("daño: " + fantasma.daño);
                System.out.println("Comandos para la pelea:");
                System.out.println("[1] para atacar");
                System.out.println("[2] para curarte");
                System.out.println("[3] cambiar de arma");
                int ataque = scanner.getInt();

                if(ataque == 1){

                    fantasma.vida = fantasma.vida-jugador.armaActual.daño;
                    System.out.println("Vida enemigo:" + fantasma.vida);

                    jugador.vida = jugador.vida-fantasma.daño;
                    System.out.println("Vida jugador:" + jugador.vida);

                }

                if(ataque == 2){

                    vendas.curar(jugador);

                }

                if(ataque == 3){

                    System.out.println("Seleccion el arma con la que vas a atacar:");

                        jugador.seleccionarArma();

                    }
                }
            }
        }


    public void minar(Hierro hierro){

        int hierroObtenido = ThreadLocalRandom.current().nextInt(1, 2 + 1);

            hierro.cantidad = hierro.cantidad+hierroObtenido;

            System.out.println("Has obtenido [" + hierroObtenido + "] de hierro.");
    }
}
