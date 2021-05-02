package com.spectu.game;

import com.spectu.game.armas.Ametralladora;
import com.spectu.game.armas.Cañon;
import com.spectu.game.armas.Escopeta;
import com.spectu.game.entidades.Jugador;
import com.spectu.game.entidades.Monstruo;
import com.spectu.game.lugares.Lugar;
import com.spectu.game.objetos.Botequin;

public class Game {

    private ScannerWrapper scanner;

    public Cañon cañon;
    public Ametralladora ametralladora;
    public Escopeta escopeta;
    public Jugador jugador;
    public Monstruo monstruo1;
    public Botequin botequin;
    public Lugar lugar;
    public String nombre;


    public Game() {
        this.scanner = new ScannerWrapper();


        this.cañon = new Cañon();
        this.ametralladora = new Ametralladora();
        this.escopeta = new Escopeta();
        this.lugar = new Lugar();
        this.botequin = new Botequin();
        this.jugador = new Jugador(nombre);
        this.monstruo1 = new Monstruo(15);
    }

    public void start() {

        System.out.println("Ingresa el nombre de tu personaje: ");
        nombre = scanner.getString();
        jugador.setNombre(nombre);

        System.out.println("Bienvenido a AdventureTime " + jugador.getNombre() + " Espero y te diviertas! :3");

        while (true)
            update();

    }

    public void update() {

        System.out.println("Comandos: ");
        System.out.println("[1] para ver tu vida actual y ver tus botequines actuales.");
        System.out.println("[2] para curarte.");
        System.out.println("[3] para seleccionar un arma.");
        System.out.println("[4] para explorar");

        int menuPrincipal = scanner.getInt();

        if (menuPrincipal == 1) {

            jugador.vidaActual();
            botequin.numeroDeBotequines();
            return;

        }

        if (menuPrincipal == 2) {


            if (jugador.vida == 100) {

                System.out.println("Tu vida actual es 100 a si que no puedes curarte");

            } else {

                botequin.curar(jugador);

            }

            return;

        }

        if (menuPrincipal == 3) {

            System.out.println("Selecciona el arma que vas a usar [1 para la ametralladora, 2 para la escopeta, 3 para el cañon]");
            int arma = scanner.getInt();

            if (arma == 1) {

                jugador.armaActual = ametralladora;
                System.out.println("El arma actual es la ametralladora");
                return;
            }

            if (arma == 2) {

                jugador.armaActual = escopeta;
                System.out.println("El arma actual es la escopeta");
                return;
            }

            if (arma == 3) {

                jugador.armaActual = cañon;
                System.out.println("El arma actual es el cañon");
                return;
            }


        }

        if(menuPrincipal == 4){

            System.out.println("¿Estas seguro de que quieres explorar? [[Escribe true para responder si] o [escribe false para responder no]");
            boolean explorarPregunta = scanner.getBoolean();
            if(explorarPregunta == true){

                lugar.explorar(botequin);

             }
          }
        }
    }



