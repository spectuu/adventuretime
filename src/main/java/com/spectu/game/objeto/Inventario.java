package com.spectu.game.objeto;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    public Objeto objetosInventario;
    int[] inventario = new int[5];

    public void mostrarInventario(Hierro hierro, Alma alma, Acero acero, Medicina vendas, Plata plata) {

        inventario[0] = hierro.cantidad;
        inventario[1] = alma.cantidad;
        inventario[2] = acero.cantidad;
        inventario[3] = vendas.cantidad;
        inventario[4] = plata.cantidad;

    }
}
