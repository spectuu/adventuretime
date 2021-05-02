package com.spectu.game.lugares;

import com.spectu.game.armas.Ametralladora;
import com.spectu.game.armas.Arma;
import com.spectu.game.armas.Cañon;
import com.spectu.game.armas.Escopeta;
import com.spectu.game.objetos.Botequin;
import com.spectu.game.objetos.PotenciadorDeDañoNivel1;
import com.sun.crypto.provider.AESParameters;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Lugar {

    public void explorar(Botequin botequin, Ametralladora ametralladora, Escopeta escopeta, Cañon cañon, PotenciadorDeDañoNivel1 potenciadorDaño){

        int numeroDeBotequinesObtenidos = ThreadLocalRandom.current().nextInt(1, 3 + 1);
        int cargadoresObtenidosAmetralladora = ThreadLocalRandom.current().nextInt(1, 5 + 1);
        int cargadoresObtenidosEscopeta = ThreadLocalRandom.current().nextInt(1, 5 + 1);
        int cargadoresObtenidosCañon = ThreadLocalRandom.current().nextInt(1, 5 + 1);
        int potenciador = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        potenciadorDaño.cantidad = potenciadorDaño.cantidad+potenciador;
        botequin.cantidad = numeroDeBotequinesObtenidos+botequin.cantidad;
        ametralladora.cargador = cargadoresObtenidosAmetralladora+ametralladora.cargador;
        escopeta.cargador = cargadoresObtenidosEscopeta+escopeta.cargador;
        cañon.cargador = cargadoresObtenidosCañon+cañon.cargador;

        System.out.println("Felicidades has obtenido:" + "\n" + "["+ numeroDeBotequinesObtenidos + "] botequines");
        System.out.println("[" + cargadoresObtenidosAmetralladora + "] cargador[es] para tu ametralladora");
        System.out.println("[" + cargadoresObtenidosEscopeta + "] cargador[es] para tu escopeta");
        System.out.println("[" + cargadoresObtenidosCañon + "] cargador[es] para tu cañon");
        if(potenciador <= 10){

            System.out.println("[" + potenciador + "]" + "potenciador[es] de daño");
        }

    }
}
