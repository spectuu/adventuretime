package com.spectu.game;

import armas.Ametralladora;
import armas.Arma;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        Arma arma = new Arma();
        Ametralladora ametralladora = new Ametralladora();

        if(Ametralladora.armaActual == Ametralladora.armaActual) {
            ametralladora.disparar();
            ametralladora.recargar();
            ametralladora.balasActuales();
        }
    }
}
