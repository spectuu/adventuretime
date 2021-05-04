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
    public Espada espada;
    public Arco arco;
    public Hacha hacha;

    public Game() {
        
        this.scanner = new ScannerWrapper();
        this.jugador = new Jugador(nombre);
        this.medicina = new Medicina();
        this.lugar = new Lugar();
        this.hierro = new Hierro();
        this.espada = new Espada();
        this.arco = new Arco();
        this.hacha = new Hacha();

        
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

            System.out.println("Estas en el menu de armas aqui podras ver los atributos del arma y seleccionarla para la batalla escribe:");
            System.out.println("[1] para la espada.");
            System.out.println("[2] para el arco.");
            System.out.println("[3] para el hacha.");
            System.out.println("[4] para reparar un arma");
            int vistaArma = scanner.getInt();

            if(vistaArma == 1){

                System.out.println("Tipo de arma: " + espada.tipoDeArma);
                System.out.println("Daño: " + espada.daño);
                System.out.println("Durabilidad: " + espada.durabilidad);
                System.out.println("¿Quieres seleccionar la espada?");
                System.out.println("[Escribe si o no]");
                String  seleccionDeArma = scanner.getString();

                if(seleccionDeArma.equals("si")){

                    jugador.armaActual = espada;
                    System.out.println("El arma actual es la espada");

                }else{
                    return;
                }
            }

            if(vistaArma == 2){

                System.out.println("Tipo de arma: " + arco.tipoDeArma);
                System.out.println("Daño: " + arco.daño);
                System.out.println("Durabilidad: " + arco.durabilidad);
                System.out.println("¿Quieres seleccionar el arco?");
                System.out.println("[Escribe si o no]");
                String  seleccionDeArma = scanner.getString();

                if(seleccionDeArma.equals("si")){

                    jugador.armaActual = arco;
                    System.out.println("El arma actual es el arco");

                }else{

                    return;
                }
            }

            if(vistaArma == 3){

                System.out.println("Tipo de arma: " + hacha.tipoDeArma);
                System.out.println("Daño: " + hacha.daño);
                System.out.println("Durabilidad: " + hacha.durabilidad);
                System.out.println("¿Quieres seleccionar el hacha?");
                System.out.println("[Escribe si o no]");
                String  seleccionDeArma = scanner.getString();

                if(seleccionDeArma.equals("si")){

                    jugador.armaActual = hacha;
                    System.out.println("El arma actual es el hacha");

                }else{

                    return;
                }
            }

            if(vistaArma == 4){

                System.out.println("Para reparar un arma debes tener un tipo de objeto esta es la lista: ");
                System.out.println("[1] para reparar la espada [para reparar la espada necesitaras hierro]");
                int repararArma = scanner.getInt();

                if(repararArma == 1){

                    hierro.usarHierro(espada);


                }
            }
        }
        if(comando == 4){

            lugar.explorar(medicina);

        }

        if(comando == 5){

            lugar.minar(hierro);

        }
    }
}
