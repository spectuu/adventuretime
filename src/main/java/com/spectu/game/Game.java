package com.spectu.game;

import armas.Ametralladora;
import armas.Cañon;
import armas.Escopeta;

public class Game {

    private ScannerWrapper scanner;

    public Cañon cañon;
    public Ametralladora ametralladora;
    public Escopeta escopeta;

    public Game() {
        this.scanner = new ScannerWrapper();

        this.cañon = new Cañon();
        this.ametralladora = new Ametralladora();
        this.escopeta = new Escopeta();

    }

    public void start() {

        System.out.println("<--------------------------------------->");
        System.out.println("Bienvenido a AdventureTime");
        System.out.println("<--------------------------------------->");

        while(true)
            update();

    }

    public void update() {

        System.out.println("Elige tu arma [ametralladora, cañon, escopeta]: ");
        String armaActual = scanner.getString();

        if(armaActual.equals("ametralladora")){

        ametralladora.disparar();
        ametralladora.recargar();
        ametralladora.balasActuales();

        }

        if(armaActual.equals("cañon")){

        cañon.disparar();
        cañon.recargar();
        cañon.balasActuales();

        }

        if(armaActual.equals("escopeta")){

            escopeta.disparar();
            escopeta.recargar();
            escopeta.balasActuales();

        }

    }



}
