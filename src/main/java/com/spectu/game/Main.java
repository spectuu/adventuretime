package com.spectu.game;

import armas.Ametralladora;
import armas.Arma;
import armas.Cañon;
import armas.Escopeta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //

        Scanner scanner = new Scanner(System.in);

        Cañon cañon = new Cañon();

        Ametralladora ametralladora = new Ametralladora();

        Escopeta escopeta = new Escopeta();

        System.out.println("<--------------------------------------->");
        System.out.println("Bienvenido a AdventureTime");
        System.out.println("<--------------------------------------->");

        System.out.println("Elige tu arma [ametralladora, cañon, escopeta]: ");
        String armaActual = scanner.nextLine();

        if(armaActual.equals("ametralladora")){



        }

        if(armaActual.equals("cañon")){


        }

        if(armaActual.equals("escopeta")){


        }

    }
}
