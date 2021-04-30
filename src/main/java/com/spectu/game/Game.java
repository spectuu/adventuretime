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

        System.out.println("Comandos: ");
        System.out.println("[1] para ver tu vida actual.");
        System.out.println("[2] para curarte.");
        System.out.println("[3] para seleccionar un arma.");
        System.out.println("[4] para disparar el arma.");

        int menuPrincipal = scanner.getInt();

        if(menuPrincipal == 1){

            jugador.vidaActual();
            return;

        }

        if(menuPrincipal == 2){



            if(jugador.vida == 100){

                System.out.println("Tu vida actual es 100 a si que no puedes curarte");
            }else{

                jugador.curar();

            }

            return;

        }

        if(menuPrincipal == 3){

            System.out.println("Selecciona el arma que vas a usar [1 para la ametralladora, 2 para la escopeta, 3 para el cañon]");
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

                if(jugador.armaActual == null){

                    System.out.println("Antes tienes que seleccionar un arma.");
                }

                jugador.armaActual.disparar();
                jugador.armaActual.recargar();
                jugador.armaActual.balasActuales();


            }


        }



    }



