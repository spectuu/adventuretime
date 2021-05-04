package com.spectu.game.entidad;

import com.spectu.game.ScannerWrapper;
import com.spectu.game.arma.Arco;
import com.spectu.game.arma.Arma;
import com.spectu.game.arma.Espada;
import com.spectu.game.arma.Hacha;

public class Jugador extends Entidad {

    public Arma armaActual;
    private ScannerWrapper scanner = new ScannerWrapper();

    public Espada espada = new Espada();
    public Arco arco = new Arco();
    public Hacha hacha = new Hacha();


    public Jugador(String nombre) {
        super(nombre, 50);

    }

    public void vidaActual() {

        System.out.println("Vida Actual: " + vida);

    }

    public void seleccionarArma() {

        System.out.println("Selecciona un arma usando: ");
        System.out.println("[1] para la espada.");
        System.out.println("[2] para el arco.");
        System.out.println("[3] para el hacha.");
        System.out.println("[4] para reparar un arma");
        int vistaArma = scanner.getInt();

        if (vistaArma == 1) {

            System.out.println("ATRIBUTOS:");
            System.out.println("Tipo de arma: " + espada.tipoDeArma);
            System.out.println("Daño: " + espada.daño);
            System.out.println("Durabilidad: " + espada.durabilidad);
            System.out.println("¿Quieres seleccionar la espada?");
            System.out.println("[Escribe si o no]");
            String seleccionDeArma = scanner.getString();

            if (seleccionDeArma.equals("si")) {

                armaActual = espada;
                System.out.println("El arma actual es la espada");

            } else {
                return;
            }
        }

        if (vistaArma == 2) {

            System.out.println("ATRIBUTOS:");
            System.out.println("Tipo de arma: " + arco.tipoDeArma);
            System.out.println("Daño: " + arco.daño);
            System.out.println("Durabilidad: " + arco.durabilidad);
            System.out.println("¿Quieres seleccionar el arco?");
            System.out.println("[Escribe si o no]");
            String seleccionDeArma = scanner.getString();

            if (seleccionDeArma.equals("si")) {

                armaActual = arco;
                System.out.println("El arma actual es el arco");

            } else {

                return;
            }
        }

        if (vistaArma == 3) {

            System.out.println("ATRIBUTOS:");
            System.out.println("Tipo de arma: " + hacha.tipoDeArma);
            System.out.println("Daño: " + hacha.daño);
            System.out.println("Durabilidad: " + hacha.durabilidad);
            System.out.println("¿Quieres seleccionar el hacha?");
            System.out.println("[Escribe si o no]");
            String seleccionDeArma = scanner.getString();

            if (seleccionDeArma.equals("si")) {

                armaActual = hacha;
                System.out.println("El arma actual es el hacha");

            } else {

                return;
            }
        }
    }
}
