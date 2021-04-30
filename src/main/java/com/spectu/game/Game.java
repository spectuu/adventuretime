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
        this.jugador = new Jugador(nombre);
    }

    public void start() {

        System.out.println("Ingresa el nombre de tu personaje: ");
        nombre = scanner.getString();
        jugador.setNombre(nombre);

        System.out.println("Bienvenido a AdventureTime " + jugador.getNombre() + " Espero y te diviertas! :3");

        while(true)
            update();

    }

    public void update() {

        System.out.println("hola " + jugador.getNombre() + " Este es el menu principal y sus comandos:" +
               "\n" + "coloca 1 para ver tu vida actual " + "\n" + "2 para curarte " + "\n" + "3 para cambiar de arma" + "\n" + "4 para disparar el arma" + "\n" + "ingresa un numero:");
        int menuPrincipal = scanner.getInt();

        if(menuPrincipal == 1){

            jugador.vidaActual();
            return;

        }

        if(menuPrincipal == 2){

            jugador.curar();
            jugador.vidaActual();
            return;
        }

        if(menuPrincipal == 3){

            int arma = scanner.getInt();

            if(arma == 1){

                jugador.armaActual = ametralladora;
                return;
            }

            if(arma == 2){

               jugador.armaActual = escopeta;
                return;
            }

            if(arma == 3){

                jugador.armaActual = cañon;
                return;
            }

        }

        if(menuPrincipal == 4){

            jugador.armaActual.disparar();
            jugador.armaActual.recargar();
            jugador.armaActual.balasActuales();
            return;
        }

    }



}
