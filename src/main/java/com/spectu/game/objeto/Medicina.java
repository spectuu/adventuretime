package com.spectu.game.objeto;

import com.spectu.game.entidad.Jugador;

public class Medicina extends Objeto {


    public Medicina() {

        super("Vendas", "Curar un porcentaje de vida", 0);

    }

    public void curar(Jugador jugador) {

        if (cantidad > 0) {

            jugador.vida = jugador.vida + 15;
            if (jugador.vida > 100){
                jugador.vida = 100;
                System.out.println("La vida maxima es 100.");
            }else{

                System.out.println("Vida actual: " + jugador.vida);
                cantidad = cantidad - 1;

            }

            } else if (cantidad <= 0) {

            cantidad = 0;
            System.out.println("no tienes vendas para curarte");
            return;

        }

    }


    public void mostrarInventario(Hierro hierro, Alma alma, Acero acero, Medicina vendas, Plata plata, Carbon carbon) {

        int[] inventarioNumero = new int[6];
        String[] inventarioTipoDeObjeto = new String[6];

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
