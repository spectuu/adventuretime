package com.spectu.game.objeto;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    int[] inventarioNumero = new int[6];
    String[] inventarioTipoDeObjeto = new String[6];

    public void mostrarInventario(Hierro hierro, Alma alma, Acero acero, Medicina vendas, Plata plata, Carbon carbon) {

    inventarioNumero[0] = hierro.cantidad;
    inventarioNumero[1] = alma.cantidad;
    inventarioNumero[2] = acero.cantidad;
    inventarioNumero[3] = vendas.cantidad;
    inventarioNumero[4] = plata.cantidad;
    inventarioNumero[5] = carbon.cantidad;


    inventarioTipoDeObjeto[0] = hierro.tipoDeObjeto;
    inventarioTipoDeObjeto[1] = alma.tipoDeObjeto;
    inventarioTipoDeObjeto[2] = acero.tipoDeObjeto;
    inventarioTipoDeObjeto[3] = vendas.tipoDeObjeto;
    inventarioTipoDeObjeto[4] = plata.tipoDeObjeto;
    inventarioTipoDeObjeto[5] = carbon.tipoDeObjeto;

    for(int i = 0; i < inventarioNumero.length; i++){

        System.out.println("[" + inventarioNumero[i] + "] " + inventarioTipoDeObjeto[i]);

     }
    }
}
