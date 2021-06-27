package com.spectu.game;

import com.spectu.game.entidad.Jugador;
import com.spectu.game.mundo.BosqueRetorcido;
import com.spectu.game.mundo.MinasOlvidadas;
import com.spectu.game.objeto.*;

public class Game {

    public Jugador jugador;
    public String nombre;
    public BosqueRetorcido bosqueRetorcido;
    public MinasOlvidadas minasOlvidadas;
    public String saves = "stats.txt";

    private ScannerWrapper scanner;


    public Game() {

        this.scanner = new ScannerWrapper();
        this.jugador = new Jugador(nombre);
        this.bosqueRetorcido = new BosqueRetorcido();
        this.minasOlvidadas = new MinasOlvidadas();

    }

    public void start() {
        System.out.println("Bienvenido a RPGQUEST:");
        System.out.println("[1] para iniciar una nueva partida");
        System.out.println("[2] para continuar una partida pre-guardada");
        int menuPrincipal = scanner.getInt();
        if (menuPrincipal == 1) {
            System.out.println("Ingresa el nombre de tu personaje: ");
            nombre = scanner.getString();
            jugador.setNombre(nombre);
            System.out.println("ya puedes divertirte " + nombre + "!");
        }
        if (menuPrincipal == 2) {
            boolean isReadingWeapons = false;
            boolean isReadingInventory = false;
            boolean isReadingEspada = false;
            boolean isReadingEspadaLarga = false;
            boolean isReadingHacha = false;
            boolean isReadingMazo = false;
            boolean isReadingHierro = false;
            boolean isReadingPlata = false;
            boolean isReadingAcero = false;
            boolean isReadingAlma = false;
            boolean isReadingCarbon = false;
            boolean isReadingVendas = false;
            for (String line : fileManagement.leerArchivo(saves)) {
                if (line.startsWith("Player name:")) {
                    String name = line.replaceFirst("Player name:", "");
                    jugador.nombre = name;
                    continue;
                }
                if (line.startsWith("Player heal:")) {
                    String heal = line.replaceFirst("Player heal:", "");
                    int playerHeal = Integer.parseInt(heal);
                    jugador.vida = playerHeal;
                }
                if (line.startsWith("Weapons:")) {
                    isReadingWeapons = true;
                    continue;
                }
                if (line.startsWith("Espada{") && isReadingWeapons) {
                    isReadingEspada = true;
                    continue;
                }
                if (line.startsWith("Durability:") && isReadingEspada) {
                    String espada = line.replaceFirst("Durability:", "");
                    int durabilityEspada = Integer.parseInt(espada);
                    jugador.espada.durabilidad = durabilityEspada;
                    isReadingEspada = false;
                    continue;
                }
                if (line.startsWith("Espada larga{")) {
                    isReadingEspadaLarga = true;
                    continue;
                }
                if (line.startsWith("Durability:") && isReadingEspadaLarga) {
                    String espadaLarga = line.replaceFirst("Durability:", "");
                    int durabilityEspadaLarga = Integer.parseInt(espadaLarga);
                    jugador.espadaLarga.durabilidad = durabilityEspadaLarga;
                    isReadingEspadaLarga = false;
                    continue;
                }
                if (line.startsWith("Hacha{")) {
                    isReadingHacha = true;
                    continue;
                }
                if (line.startsWith("Durability:") && isReadingHacha) {
                    String hacha = line.replaceFirst("Durability:", "");
                    int durabilityHacha = Integer.parseInt(hacha);
                    jugador.hacha.durabilidad = durabilityHacha;
                    isReadingHacha = false;
                    continue;
                }
                if (line.startsWith("Mazo{")) {
                    isReadingMazo = true;
                    continue;
                }
                if (line.startsWith("Durability:") && isReadingMazo) {
                    String mazo = line.replaceFirst("Durability:", "");
                    int durabilityMazo = Integer.parseInt(mazo);
                    jugador.mazo.durabilidad = durabilityMazo;
                    isReadingMazo = false;
                    isReadingWeapons = false;
                    continue;
                }
                if (line.startsWith("inventory:")) {
                    isReadingInventory = true;
                    continue;
                }
                if (line.startsWith("Hierro{") && isReadingInventory) {
                    isReadingHierro = true;
                    continue;
                }
                if (line.startsWith("Amount:") && isReadingHierro) {
                    String hierro = line.replaceFirst("Amount:", "");
                    int amountHierro = Integer.parseInt(hierro);
                    jugador.inventario.getHierro().cantidad = amountHierro;
                    isReadingHierro = false;
                    continue;
                }
                if (line.startsWith("Plata{")) {
                    isReadingPlata = true;
                    continue;
                }
                if (line.startsWith("Amount:") && isReadingPlata) {
                    String plata = line.replaceFirst("Amount:", "");
                    int amountPlata = Integer.parseInt(plata);
                    jugador.inventario.getPlata().cantidad = amountPlata;
                    isReadingPlata = false;
                    continue;
                }
                if (line.startsWith("Acero{")) {
                    isReadingAcero = true;
                    continue;
                }
                if (line.startsWith("Amount:") && isReadingAcero) {
                    String acero = line.replaceFirst("Amount:", "");
                    int amountAcero = Integer.parseInt(acero);
                    jugador.inventario.getAcero().cantidad = amountAcero;
                    isReadingAcero = false;
                    continue;
                }
                if (line.startsWith("Alma{")) {
                    isReadingAlma = true;
                    continue;
                }
                if (line.startsWith("Amount:") && isReadingAlma) {
                    String alma = line.replaceFirst("Amount:", "");
                    int amountAlma = Integer.parseInt(alma);
                    jugador.inventario.getAlma().cantidad = amountAlma;
                    isReadingAlma = false;
                    continue;
                }
                if (line.startsWith("Carbon{")) {
                    isReadingCarbon = true;
                    continue;
                }
                if (line.startsWith("Amount:") && isReadingCarbon) {
                    String carbon = line.replaceFirst("Amount:", "");
                    int amountCarbon = Integer.parseInt(carbon);
                    jugador.inventario.getCarbon().cantidad = amountCarbon;
                    isReadingCarbon = false;
                    continue;
                }
                if (line.startsWith("Vendas{")) {
                    isReadingVendas = true;
                    continue;
                }
                if (line.startsWith("Amount:") && isReadingVendas) {
                    String vendas = line.replaceFirst("Amount:", "");
                    int amountVendas = Integer.parseInt(vendas);
                    jugador.inventario.getMedicina().cantidad = amountVendas;
                    isReadingVendas = false;
                    isReadingInventory = false;
                    continue;
                }
            }
            System.out.println("Bienvenido otra vez " + jugador.nombre);
            System.out.println("La partida se a cargado correctamente.");
        }
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

            jugador.inventario.getMedicina().curar(jugador);
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

        if (comando == 9) {
            fileManagement.crearArchivo(saves);
            fileManagement.anexarInformacion(saves, "Player name:" + jugador.getNombre());
            fileManagement.anexarInformacion(saves, "Player heal:" + jugador.vida);
            fileManagement.anexarInformacion(saves, "Weapons:\n" + jugador.espada.nombreDelArma + "{\n"
                    + "Durability:" + jugador.espada.durabilidad + "\n}" + "\n" + jugador.espadaLarga.nombreDelArma + "{\n"
                    + "Durability:" + jugador.espadaLarga.durabilidad + "\n}" + "\n" + jugador.hacha.nombreDelArma + "{\n"
                    + "Durability:" + jugador.hacha.durabilidad + "\n}" + "\n" + jugador.mazo.nombreDelArma + "{\n"
                    + "Durability:" + jugador.mazo.durabilidad + "\n}"
            );
            fileManagement.anexarInformacion(saves, "inventory:");
            for (int i = 0; i < jugador.inventario.objetos.length; i++) {
                Objeto objeto = jugador.inventario.objetos[i];
                fileManagement.anexarInformacion(saves, objeto.tipoDeObjeto + "{\nAmount:" + objeto.cantidad + "\n}");
            }
            System.out.println("La partida se ha guardado correctamente.");
        }

        if (comando == 0) {

            System.out.println("Nos vemos :)");
            System.exit(-1);
            return;
        }
    }


}
