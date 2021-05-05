package com.spectu.game.mundo;

import com.spectu.game.objeto.Hierro;
import com.spectu.game.objeto.Plata;

import java.util.concurrent.ThreadLocalRandom;

public class MinasOlvidadas {

    public void minar(Hierro hierro, Plata plata) {

        int hierroObtenido = ThreadLocalRandom.current().nextInt(1, 2 + 1);
        int plataObtenida = ThreadLocalRandom.current().nextInt(1, 6);
        hierro.cantidad = hierro.cantidad + hierroObtenido;
        plata.cantidad = plata.cantidad + plataObtenida;

        System.out.println("Has obtenido [" + hierroObtenido + "] de hierro.");
        System.out.println("Has obtenido [" + plataObtenida + "] de plata.");
    }



}
