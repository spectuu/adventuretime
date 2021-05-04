package com.spectu.game.mundo;

import com.spectu.game.objeto.Hierro;
import com.spectu.game.objeto.Medicina;

import java.util.concurrent.ThreadLocalRandom;

public class Lugar {
    
    public void explorar(Medicina vendas){

        int vendasObtenidas = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        int probabilidadVendas = ThreadLocalRandom.current().nextInt(1, 100 + 1);

        if(probabilidadVendas == 50){

            vendas.cantidad = vendasObtenidas+vendas.cantidad;

            System.out.println("Has obtenido [" + vendasObtenidas + "] venda[s].");

        }else{

            System.out.println("no as obtenido nada mejor suerte para la proxima :b");

        }

    }

    public void minar(Hierro hierro){

        int hierroObtenido = ThreadLocalRandom.current().nextInt(1, 2 + 1);
        int probabilidadHierro = ThreadLocalRandom.current().nextInt(1, 100 + 1);

            hierro.cantidad = hierro.cantidad+hierroObtenido;

            System.out.println("Has obtenido [" + hierroObtenido + "] de hierro.");
    }
}
