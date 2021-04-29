package com.spectu.game;

import com.spectu.game.armas.Ametralladora;
import com.spectu.game.armas.Cañon;
import com.spectu.game.armas.Escopeta;
import com.spectu.game.entidades.Jugador;
import com.spectu.game.entidades.Monstruo;

public class Game {

    private ScannerWrapper scanner;

    public Cañon cañon;
    public Ametralladora ametralladora;
    public Escopeta escopeta;
    public Jugador jugador;
    public Monstruo monstruo;
    public String nombre;

    public Game() {
        this.scanner = new ScannerWrapper();


        this.cañon = new Cañon();
        this.ametralladora = new Ametralladora();
        this.escopeta = new Escopeta();
        this.jugador = new Jugador(nombre, 100);
    }

    public void start() {

        System.out.println("Ingresa el nombre de tu personaje: ");
        nombre = scanner.getString();

        System.out.println("Bienvenido a AdventureTime " + nombre + " Espero y te diviertas! :3");


        while(true)
            update();

    }

    public void update() {

        System.out.println("Menu principal");
        String menuPrincipal = scanner.getString();

        if(menuPrincipal.equals("vidaActual")){

            jugador.vidaActual();

        }

        if(menuPrincipal.equals("atacar")){



        }

        if(menuPrincipal.equals("disparar 1")){

        ametralladora.disparar();
        ametralladora.recargar();
        ametralladora.balasActuales();

        }

        if(menuPrincipal.equals("disparar 2")){

        cañon.disparar();
        cañon.recargar();
        cañon.balasActuales();

        }

        if(menuPrincipal.equals("disparar 3")){

            escopeta.disparar();
            escopeta.recargar();
            escopeta.balasActuales();

        }

    }



}
