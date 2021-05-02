package com.spectu.game.objetos;

import com.spectu.game.armas.Ametralladora;
import com.spectu.game.armas.Cañon;
import com.spectu.game.armas.Escopeta;

import java.util.Calendar;

public class Inventario {

    public void mostrarInventario(Botequin botequin, Ametralladora ametralladora, Escopeta escopeta, Cañon cañon){

        System.out.println("Inventario: ");
        System.out.println("[" + botequin.cantidad + "] botequines");
        System.out.println("[" + ametralladora.cargador + "] cargadores de ametralladora");
        System.out.println("[" + escopeta.cargador + "] cargadores de escopeta");
        System.out.println("[" + cañon.cargador + "] balas de cañon");

    }


}
