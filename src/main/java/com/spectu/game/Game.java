package com.spectu.game;

import com.spectu.game.entidad.Jugador;
import com.spectu.game.mundo.BosqueRetorcido;
import com.spectu.game.mundo.MinasOlvidadas;
import com.spectu.game.objeto.*;

public class Game {

    public Jugador jugador;
    public Medicina medicina;
    public String nombre;
    public BosqueRetorcido bosqueRetorcido;
    public MinasOlvidadas minasOlvidadas;
    public Hierro hierro;
    public Plata plata;
    public Acero acero;
    public Alma alma;
    public Carbon carbon;
    public Inventario inventario;
    private ScannerWrapper scanner;


    public Game() {

        this.scanner = new ScannerWrapper();
        this.jugador = new Jugador(nombre);
        this.medicina = new Medicina();
        this.bosqueRetorcido = new BosqueRetorcido();
        this.minasOlvidadas = new MinasOlvidadas();
        this.hierro = new Hierro();
        this.plata = new Plata();
        this.acero = new Acero();
        this.alma = new Alma();
        this.carbon = new Carbon();
        this.inventario = new Inventario();

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
        System.out.println("[5] para ver el inventario");
        System.out.println("[6] para minar");
        System.out.println("[7] para forjar");
        System.out.println("[8] para cambiar tu nombre");
        System.out.println("[0] para terminar el juego");


        int comando = scanner.getInt();

        if (comando == 1) {

            jugador.vidaActual();
            return;
        }

        if (comando == 2) {

            medicina.curar(jugador);
            return;
        }

        if (comando == 3) {

            jugador.seleccionarArma(hierro, plata, acero, alma);
            return;
        }
        if (comando == 4) {

            bosqueRetorcido.explorar(medicina, jugador, hierro, plata, alma, acero);
            return;
        }

        if (comando == 5) {

            inventario.mostrarInventario(hierro, alma, acero, medicina, plata);
            return;
        }

        if(comando == 6){

            minasOlvidadas.minar(hierro, plata, carbon);

        }

        if(comando == 7){

            jugador.forjar(hierro, carbon, acero);


        }

        if (comando == 8) {

            System.out.println("Escribe tu nuevo nombre:");
            String nombre = scanner.getString();
            jugador.setNombre(nombre);
            System.out.println("Tu nuevo nombre es " + nombre);
            return;
        }

        if (comando == 0) {

            System.out.println("Nos vemos :)");
            System.exit(-1);
            return;
        }
    }
}
