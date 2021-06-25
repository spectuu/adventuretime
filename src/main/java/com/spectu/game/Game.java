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
    public String saves = "stats.txt";

    private ScannerWrapper scanner;


    public Game() {

        this.scanner = new ScannerWrapper();
        this.jugador = new Jugador(nombre);
        this.medicina = new Medicina();
        this.bosqueRetorcido = new BosqueRetorcido();
        this.minasOlvidadas = new MinasOlvidadas();

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
        System.out.println("[1] para ver tu vida actual");
        System.out.println("[2] para curarte");
        System.out.println("[3] para ver tus armas y seleccionar una");
        System.out.println("[4] para explorar");
        System.out.println("[5] para ver el inventario");
        System.out.println("[6] para minar");
        System.out.println("[7] para forjar");
        System.out.println("[8] para cambiar tu nombre");
        System.out.println("[9] para guardar partida");
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

            jugador.seleccionarArma();
            return;
        }
        if (comando == 4) {

            bosqueRetorcido.explorar(jugador);
            return;
        }

        if (comando == 5) {

            jugador.inventario.mostrarInventario();
            return;
        }

        if (comando == 6) {

            minasOlvidadas.minar(jugador.inventario);

        }

        if (comando == 7) {

            jugador.forjar(jugador.inventario);


        }

        if (comando == 8) {

            System.out.println("Escribe tu nuevo nombre:");
            String nombre = scanner.getString();
            jugador.setNombre(nombre);
            System.out.println("Tu nuevo nombre es " + nombre);
            return;
        }

        if(comando == 9){
            fileManagement.crearArchivo(saves);
            fileManagement.anexarInformacion(saves, "Player name: " + jugador.getNombre());
            fileManagement.anexarInformacion(saves, "Player heal: " + jugador.vida);
            fileManagement.anexarInformacion(saves, "Weapons: \n " + jugador.espada.nombreDelArma + "{ \n"
                    + "Durability: " + jugador.espada.durabilidad + "\n }" + "\n" + jugador.espadaLarga.nombreDelArma + "{ \n"
                    + "Durability: " + jugador.espadaLarga.durabilidad + "\n }" + "\n" + jugador.hacha.nombreDelArma + "{ \n"
                    + "Durability: " + jugador.hacha.durabilidad + "\n }" + "\n" + jugador.mazo.nombreDelArma + "{\n"
                    + "Durability: " + jugador.mazo.durabilidad + "\n }"
            );
            fileManagement.anexarInformacion(saves, "inventory: ");
            for(int i = 0; i < jugador.inventario.objetos.length; i++){
                Objeto objeto = jugador.inventario.objetos[i];
                fileManagement.anexarInformacion(saves, "[" + objeto.cantidad + "] " + objeto.tipoDeObjeto);
            }
            System.out.println("La partida se ha guardado correctamente.");
        }

        if(comando == 10){
            boolean isReadingWeapons = false;
            boolean isReadingInventory = false;
            boolean isReadingEspada = false;
            boolean isReadingEspadaLarga = false;
            for(String line: fileManagement.leerArchivo(saves)){
                if(line.startsWith("Player name: ")) {
                    String name = line.replaceFirst("Player name: ", "");
                    continue;
                }
                if(line.startsWith("Weapons:")) {
                    isReadingWeapons = true;
                    continue;
                }
                if(line.startsWith("Espada{ ") && isReadingWeapons){
                    isReadingEspada = true;
                    continue;
                }
                if(line.startsWith("Durability: ") && isReadingEspada){
                    String durabilityEspada = line.replaceFirst("Durability: ", "");
                    isReadingEspada = false;
                    continue;
                }
                if(line.startsWith("Espada larga{")){
                    isReadingEspadaLarga = true;
                    continue;
                }
                if(line.startsWith("Durability: ") && isReadingEspadaLarga){
                    String durabilityEspadaLarga = line.replaceFirst("Durability: ", "");
                    isReadingEspadaLarga = false;
                    continue;
                }
                System.out.println(line);
            }
        }


        if (comando == 0) {

            System.out.println("Nos vemos :)");
            System.exit(-1);
            return;
        }
    }



}
