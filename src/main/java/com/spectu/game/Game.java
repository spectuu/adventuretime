package com.spectu.game;

import com.spectu.game.entidad.Jugador;
import com.spectu.game.mundo.BosqueRetorcido;
import com.spectu.game.mundo.MinasOlvidadas;
import com.spectu.game.objeto.Hierro;
import com.spectu.game.objeto.Medicina;
import com.spectu.game.objeto.Plata;

public class Game {

    public Jugador jugador;
    public Medicina medicina;
    public String nombre;
    public BosqueRetorcido bosqueRetorcido;
    public MinasOlvidadas minasOlvidadas;
    public Hierro hierro;
    public Plata plata;
    private ScannerWrapper scanner;


    public Game() {

        this.scanner = new ScannerWrapper();
        this.jugador = new Jugador(nombre);
        this.medicina = new Medicina();
        this.bosqueRetorcido = new BosqueRetorcido();
        this.minasOlvidadas = new MinasOlvidadas();
        this.hierro = new Hierro();
        this.plata = new Plata();

    }

    public void start() {

        System.out.println("Ingresa el nombre de tu personaje: ");
        nombre = scanner.getString();
        jugador.setNombre(nombre);

        System.out.println("Bienvenido " + "a RPGQuest " + jugador.getNombre() + " espero y te diviertas! \n");

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
        System.out.println("[6] para cambiar tu nombre");
        System.out.println("[0] para terminar el juego");


        int comando = scanner.getInt();

        if (comando == 1) {

            jugador.vidaActual();

        }

        if (comando == 2) {

            medicina.curar(jugador);

        }

        if (comando == 3) {

            jugador.seleccionarArma(hierro, plata);

        }
        if (comando == 4) {

            bosqueRetorcido.explorar(medicina, jugador, hierro, plata);

        }

        if (comando == 5) {

            minasOlvidadas.minar(hierro, plata);

        }
        
        if(comando == 6){

            System.out.println("Escribe tu nuevo nombre:");
            String nombre = scanner.getString();
            jugador.setNombre(nombre);
            System.out.println("Tu nuevo nombre es " + nombre);
        }

        if(comando == 0){

            System.exit(-1);
        }
    }
}
