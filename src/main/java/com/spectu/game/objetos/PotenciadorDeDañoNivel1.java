package com.spectu.game.objetos;

import com.spectu.game.Game;
import com.spectu.game.armas.Ametralladora;
import com.spectu.game.armas.Cañon;
import com.spectu.game.armas.Escopeta;

import java.util.Calendar;

public class PotenciadorDeDañoNivel1 extends Objeto{

    public int aumentoDeDaño = 15;

    public PotenciadorDeDañoNivel1() {
        super("Potenciador de daño", 0);
    }

    public void usarPotenciador(Game game, Ametralladora ametralladora, Escopeta escopeta, Cañon cañon){

        if(cantidad == 0){

            System.out.println("No tienes potenciadores");

        }else {

            game.potenciadorHasta = System.currentTimeMillis() + (10 * 1000);

            ametralladora.daño = ametralladora.daño + aumentoDeDaño;
            escopeta.daño = escopeta.daño + aumentoDeDaño;
            cañon.daño = cañon.daño + aumentoDeDaño;
            System.out.println("Ahora todas tus armas tiene +15 de daño!");

        }




    }

    public void d(Ametralladora ametralladora, Escopeta escopeta, Cañon cañon){

        System.out.println(ametralladora.daño);
        System.out.println(escopeta.daño);
        System.out.println(cañon.daño);
    }

}
