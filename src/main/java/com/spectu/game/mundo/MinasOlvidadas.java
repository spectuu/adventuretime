package com.spectu.game.mundo;

import com.spectu.game.objeto.Carbon;
import com.spectu.game.objeto.Hierro;
import com.spectu.game.objeto.Plata;

import java.util.concurrent.ThreadLocalRandom;

public class MinasOlvidadas {

    public void minar(Hierro hierro, Plata plata, Carbon carbon) {

        int hierroObtenido = ThreadLocalRandom.current().nextInt(1, (2 + 1));
        int plataObtenida = ThreadLocalRandom.current().nextInt(1, 6);
        int carbonObtenido = ThreadLocalRandom.current().nextInt(1, (3+1));
        hierro.cantidad = hierro.cantidad + hierroObtenido;
        plata.cantidad = plata.cantidad + plataObtenida;
        carbon.cantidad = carbon.cantidad + carbonObtenido;

        System.out.println("Has obtenido [" + hierroObtenido + "] de hierro.");
        System.out.println("Has obtenido [" + plataObtenida + "] de plata.");
        System.out.println("Has obtenido ["+ carbonObtenido + "] de carbon.");
    }



}
