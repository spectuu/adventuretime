package com.spectu.game;

import com.spectu.game.arma.Arco;
import com.spectu.game.arma.Espada;
import com.spectu.game.arma.Hacha;
import com.spectu.game.entidad.Jugador;
import com.spectu.game.mundo.Lugar;
import com.spectu.game.objeto.Hierro;
import com.spectu.game.objeto.Medicina;

public class Game {

    private ScannerWrapper scanner;

    public Jugador jugador;
    public Medicina medicina;
    public String nombre;
    public Lugar lugar;
    public Hierro hierro;


    public Game() {
        
        this.scanner = new ScannerWrapper();
        this.jugador = new Jugador(nombre);
        this.medicina = new Medicina();
        this.lugar = new Lugar();
        this.hierro = new Hierro();
        
    }

    public void start() {

        System.out.println("Ingresa el nombre de tu personaje: ");
        nombre = scanner.getString();
        jugador.setNombre(nombre);

        System.out.println("Bienvenido " +  "a RPGQuest " + jugador.getNombre() + " espero y te diviertas! \n");

        while (true)
            update();

    }

    public void update() {

        System.out.println("Comandos: ");
        System.out.println("[1] para ver tu vida actual.");
        System.out.println("[2] para curarte.");
        System.out.println("[3] para ver tus armas y seleccionar una.");
        System.out.println("[4] para explorar");
        System.out.println("[5] para minar");


        int comando = scanner.getInt();

        if(comando == 1){

            jugador.vidaActual();

        }

        if(comando == 2) {

            medicina.curar(jugador);

        }

        if(comando == 3){

            jugador.seleccionarArma();

        }
        if(comando == 4){

            lugar.explorar(medicina, jugador);

        }

        if(comando == 5){

            lugar.minar(hierro);

        }
    }
}
