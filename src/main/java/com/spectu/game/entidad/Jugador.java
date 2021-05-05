package com.spectu.game.entidad;

import com.spectu.game.ScannerWrapper;
import com.spectu.game.arma.Arco;
import com.spectu.game.arma.Arma;
import com.spectu.game.arma.Espada;
import com.spectu.game.arma.Hacha;
import com.spectu.game.mundo.Lugar;
import com.spectu.game.objeto.Hierro;
import com.spectu.game.objeto.Medicina;

import java.util.concurrent.ThreadLocalRandom;

public class Jugador extends Entidad {

    public Arma armaActual;
    public Enemigo enemigo;
    public Espada espada = new Espada();
    public Arco arco = new Arco();
    public Hacha hacha = new Hacha();
    private ScannerWrapper scanner = new ScannerWrapper();


    public Jugador(String nombre) {
        super(nombre, 50);

    }

    public void vidaActual() {

        System.out.println("Vida Actual: " + vida);

    }

    public void seleccionarArma(Hierro hierro) {

        System.out.println("Selecciona un arma usando: ");
        System.out.println("[1] para la espada.");
        System.out.println("[2] para el arco.");
        System.out.println("[3] para el hacha.");
        System.out.println("[4] para reparar un arma");
        int vistaArma = scanner.getInt();

        if (vistaArma == 1) {

            System.out.println("ATRIBUTOS:");
            System.out.println("Tipo de arma: " + espada.tipoDeArma);
            System.out.println("Daño: " + espada.daño);
            System.out.println("Durabilidad: " + espada.durabilidad);
            System.out.println("¿Quieres seleccionar la espada?");
            System.out.println("[Escribe si o no]");
            String seleccionDeArma = scanner.getString();

            if (seleccionDeArma.equals("si")) {

                armaActual = espada;
                System.out.println("El arma actual es la espada");

            } else {
                return;
            }
        }

        if (vistaArma == 2) {

            System.out.println("ATRIBUTOS:");
            System.out.println("Tipo de arma: " + arco.tipoDeArma);
            System.out.println("Daño: " + arco.daño);
            System.out.println("Durabilidad: " + arco.durabilidad);
            System.out.println("¿Quieres seleccionar el arco?");
            System.out.println("[Escribe si o no]");
            String seleccionDeArma = scanner.getString();

            if (seleccionDeArma.equals("si")) {

                armaActual = arco;
                System.out.println("El arma actual es el arco");

            } else {

                return;
            }
        }

        if (vistaArma == 3) {

            System.out.println("ATRIBUTOS:");
            System.out.println("Tipo de arma: " + hacha.tipoDeArma);
            System.out.println("Daño: " + hacha.daño);
            System.out.println("Durabilidad: " + hacha.durabilidad);
            System.out.println("¿Quieres seleccionar el hacha?");
            System.out.println("[Escribe si o no]");
            String seleccionDeArma = scanner.getString();

            if (seleccionDeArma.equals("si")) {

                armaActual = hacha;
                System.out.println("El arma actual es el hacha");

            } else {

                return;
            }
        }
        if (vistaArma == 4) {

            System.out.println("Aqui podras reparar tus armas para eso necesitaras un objeto en especifico del arma");
            System.out.println("[Espada] necesitas hierro");
            System.out.println("Usa: ");
            System.out.println("[1] para reparar la espada");
            int repararArma = scanner.getInt();

            if (repararArma == 1) {

                hierro.usarHierro(espada);

            }


        }
    }

    public void pelear(Hierro hierro, Medicina vendas, Jugador jugador) {

        int probabilidadEnemigo = ThreadLocalRandom.current().nextInt(1, (1 + 50));

        SoldadoDeLaRuina soldadoDeLaRuina = new SoldadoDeLaRuina();
        Fantasma fantasma = new Fantasma();
        CaballeroSombrio caballeroSombrio = new CaballeroSombrio();

            if(probabilidadEnemigo < 50){

            enemigo = soldadoDeLaRuina;

            }

            if(probabilidadEnemigo < 40){

                enemigo = fantasma;

            }

            if(probabilidadEnemigo < 20){

                enemigo = caballeroSombrio;

            }

            System.out.println("¡ALERTA DE ENEMIGO!");
            System.out.println(enemigo.nombre + ":");
            System.out.println("vida: " + enemigo.vida);
            System.out.println("daño: " + enemigo.daño);

            while (true) {

                System.out.println("Comandos para la pelea:");
                System.out.println("[1] para atacar");
                System.out.println("[2] para curarte");
                System.out.println("[3] cambiar de arma");
                int ataque = scanner.getInt();

                if (ataque == 1) {

                    enemigo.vida = enemigo.vida - armaActual.daño;
                    if(enemigo.vida < 0){
                        enemigo.vida = 0;
                    }
                    System.out.println("Vida enemigo:" + enemigo.vida);

                    vida = vida - enemigo.daño;
                    if(vida < 0){
                        vida = 0;
                    }
                    System.out.println("Vida jugador:" + vida);

                }

                if (ataque == 2) {

                    vendas.curar(jugador);

                }

                if (ataque == 3) {

                    System.out.println("Seleccion el arma con la que vas a atacar:");

                    seleccionarArma(hierro);

                }

                if (enemigo.vida <= 0) {


                    int botin = ThreadLocalRandom.current().nextInt(1 + (100 + 1));
                    int botin2 = ThreadLocalRandom.current().nextInt(1 + (3 + 1));
                    int botin3 = ThreadLocalRandom.current().nextInt(1 + (2 + 1));

                    System.out.println("Felicidades has derrotado al enemigo!");

                    if (botin > 5) {

                        System.out.println("BOTIN:");
                        System.out.println("vendas obtenidas [" + vendas.cantidad + "]");
                        System.out.println("Hierro obtenido [" + hierro.cantidad + "]");
                        vendas.cantidad = vendas.cantidad + botin2;
                        hierro.cantidad = hierro.cantidad + botin3;


                    } else {

                        System.out.println("Parace que el enemigo no tenia nada de valor suerte para la proxima :b");
                    }

                    break;

                }

                if (vida <= 0) {

                    System.out.println("Has muerto ahora dedice: ");
                    System.out.println("[Escribe [1] para vivir]");
                    System.out.println("Escribe [2] para morir");
                    System.out.println("[si elijes vivir perderas objetos]");
                    System.out.println("[si elijes morir acabara el juego]");

                    int vivirOMorir = scanner.getInt();

                    if (vivirOMorir == 1) {

                        int perdida = ThreadLocalRandom.current().nextInt(1, (2 + 3));

                        hierro.cantidad = hierro.cantidad - perdida;
                        vendas.cantidad = vendas.cantidad - perdida;
                        vida = vida+50;
                        break;

                    } else if (vivirOMorir == 2) {

                        System.exit(-1);

                    }
                }
            }
      }
}

