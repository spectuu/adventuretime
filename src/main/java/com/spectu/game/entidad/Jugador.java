package com.spectu.game.entidad;

import com.spectu.game.ScannerWrapper;
import com.spectu.game.arma.*;
import com.spectu.game.objeto.*;

import java.util.concurrent.ThreadLocalRandom;

public class Jugador extends Entidad {

    public Arma armaActual;
    public Enemigo enemigo;
    public Espada espada = new Espada();
    public EspadaLarga espadaLarga = new EspadaLarga();
    public Hacha hacha = new Hacha();
    public Mazo mazo = new Mazo();
    public Objeto objeto;
    private ScannerWrapper scanner = new ScannerWrapper();


    public Jugador(String nombre) {
        super(nombre, 50);

    }

    public void vidaActual() {

        System.out.println("Vida Actual: " + vida);

    }

    public void seleccionarArma(Hierro hierro, Plata plata, Acero acero, Alma alma) {

        System.out.println("Selecciona un arma usando: ");
        System.out.println("[1] para la espada.");
        System.out.println("[2] para la espada larga.");
        System.out.println("[3] para el hacha.");
        System.out.println("[4] para el mazo");
        System.out.println("[5] para reparar un arma");
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
            System.out.println("Tipo de arma: " + espadaLarga.tipoDeArma);
            System.out.println("Daño: " + espadaLarga.daño);
            System.out.println("Durabilidad: " + espadaLarga.durabilidad);
            System.out.println("¿Quieres seleccionar la espada larga?");
            System.out.println("[Escribe si o no]");
            String seleccionDeArma = scanner.getString();

            if (seleccionDeArma.equals("si")) {

                armaActual = espadaLarga;
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

            System.out.println("ATRIBUTOS:");
            System.out.println("Tipo de arma: " + mazo.tipoDeArma);
            System.out.println("Daño: " + mazo.daño);
            System.out.println("Durabilidad: " + mazo.durabilidad);
            System.out.println("¿Quieres seleccionar el mazo?");
            System.out.println("[Escribe si o no]");
            String seleccionDeArma = scanner.getString();

            if (seleccionDeArma.equals("si")) {

                armaActual = mazo;
                System.out.println("El arma actual es el mazo");

            }

        }
        if (vistaArma == 5) {

            System.out.println("Aqui podras reparar tus armas para eso necesitaras un objeto en especifico del arma");
            System.out.println("[Espada] se reparar con hierro.");
            System.out.println("[Hacha] se reparar con plata.");
            System.out.println("[Espada larga] se reparar con acero.");
            System.out.println("Usa: ");
            System.out.println("[1] para reparar la espada.");
            System.out.println("[2] para reparar el hacha.");
            System.out.println("[3] para reparar la espada larga.");
            System.out.println("[4] para reparar el mazo.");
            int repararArma = scanner.getInt();

            if (repararArma == 1) {

                objeto = hierro;

                hierro.usarObjeto(espada);

            }

            if (repararArma == 2) {

                objeto = plata;

                plata.usarObjeto(hacha);

            }

            if (repararArma == 3) {

                objeto = acero;

                acero.usarObjeto(espadaLarga);
            }

            if (repararArma == 4) {

                objeto = alma;

               alma.usarObjeto(mazo);

            }

        }
    }

    public void pelear(Hierro hierro, Medicina vendas, Jugador jugador, Plata plata, Acero acero, Alma alma) {

        int probabilidadEnemigo = ThreadLocalRandom.current().nextInt(1, (1 + 50));

        if (probabilidadEnemigo < 50 && probabilidadEnemigo > 40) {

            SoldadoDeLaRuina soldadoDeLaRuina = new SoldadoDeLaRuina();
            enemigo = soldadoDeLaRuina;

        }

        if (probabilidadEnemigo < 40 && probabilidadEnemigo > 30) {
            Fantasma fantasma = new Fantasma();
            enemigo = fantasma;

        }

        if (probabilidadEnemigo < 20 && probabilidadEnemigo > 1) {

            CaballeroSombrio caballeroSombrio = new CaballeroSombrio();
            enemigo = caballeroSombrio;

        }

        if (probabilidadEnemigo < 5 && probabilidadEnemigo > 1) {

            Viego viego = new Viego();
            enemigo = viego;

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
            System.out.println("[4] para huir");
            int ataque = scanner.getInt();

            if (ataque == 1) {

                jugador.vida = jugador.vida - jugador.enemigo.daño;
                armaActual.durabilidad = armaActual.durabilidad - 2;
                if (vida < 0)
                    vida = 0;
                System.out.println("Vida jugador:" + vida);
                jugador.enemigo.vida = jugador.enemigo.vida - armaActual.daño;
                if (enemigo.vida < 0)
                    enemigo.vida = 0;
                System.out.println("Vida enemigo:" + enemigo.vida);


            }

            if (ataque == 2) {

                vendas.curar(jugador);

            }

            if (ataque == 3) {

                System.out.println("Seleccion el arma con la que vas a atacar:");

                seleccionarArma(hierro, plata, acero, alma);

            }

            if (ataque == 4) {

                break;
            }

            if (enemigo.vida <= 0) {
                enemigo.vida = 0;

                int botin = ThreadLocalRandom.current().nextInt(1 + (100 + 1));
                int botin2 = ThreadLocalRandom.current().nextInt(1 + (3 + 1));
                int botin3 = ThreadLocalRandom.current().nextInt(1 + (2 + 1));

                System.out.println("Felicidades has derrotado al enemigo!");

                if (botin > 5) {

                    System.out.println("BOTIN:");
                    System.out.println("vendas obtenidas [" + botin2 + "]");
                    System.out.println("Hierro obtenido [" + botin3 + "]");
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
                    if (hierro.cantidad < 0)
                        hierro.cantidad = 0;
                    vendas.cantidad = vendas.cantidad - perdida;
                    if (plata.cantidad < 0)
                        plata.cantidad = 0;
                    vida = vida + 50;
                    break;
                } else if (vivirOMorir == 2) {

                    System.exit(-1);
                }
            }
        }
    }
}

