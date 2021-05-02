package com.spectu.game.lugares;

import com.spectu.game.objetos.Botequin;

import java.util.Random;

public class Lugar {

    Random rmd = new Random();
    public int numeroDeObjetosObtenidos = rmd.nextInt();

    public void explorar(Botequin botequin){

        botequin.cantidad = numeroDeObjetosObtenidos+botequin.cantidad;
        System.out.println("Felicidades has obtenido ["+ numeroDeObjetosObtenidos + "] botequines!");

    }


}
