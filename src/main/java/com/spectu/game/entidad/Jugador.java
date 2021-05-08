package com.spectu.game.entidad;

import com.spectu.game.ScannerWrapper;
import com.spectu.game.arma.*;
import com.spectu.game.objeto.*;

import java.util.concurrent.ThreadLocalRandom;

public class Jugador extends Entidad {

    public Arma armaActual;
    public Arma armaSelecionada;
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

    public void atributosDelArma() {

        System.out.println("ATRIBUTOS:");
        System.out.println("Tipo de arma: " + armaSelecionada.tipoDeArma);
        System.out.println("Daño: " + armaSelecionada.daño);
        System.out.println("Durabilidad: " + armaSelecionada.durabilidad);
        System.out.println("¿Quieres seleccionar este tipo de arma?");
        System.out.println("[Escribe si o no]");
        String seleccionDeArma = scanner.getString();

        if (seleccionDeArma.equals("si")) {

            armaActual = armaSelecionada;
            System.out.println("Arma Actual: " + armaSelecionada.nombreDelArma);

        }
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

            armaSelecionada = espada;
            atributosDelArma();

            if(armaSelecionada.durabilidad <= 0){
                while(true){
                    armaSelecionada = null;
                    System.out.println("El arma seleccionada esta rota");
                    seleccionarArma(hierro, plata, acero, alma);
                    if(armaSelecionada != null){
                        break;
                    }
                }
            }



        }

        if (vistaArma == 2) {
            armaSelecionada = espadaLarga;
            atributosDelArma();
            if(armaSelecionada.durabilidad <= 0){
                while(true){
                    armaSelecionada = null;
                    System.out.println("El arma seleccionada esta rota");
                    seleccionarArma(hierro, plata, acero, alma);
                    if(armaSelecionada != null){
                        break;
                    }
                }
            }


        }

        if (vistaArma == 3) {
            armaSelecionada = hacha;
            atributosDelArma();
            if(armaSelecionada.durabilidad <= 0){
                while(true){
                    armaSelecionada = null;
                    System.out.println("El arma seleccionada esta rota");
                    seleccionarArma(hierro, plata, acero, alma);
                    if(armaSelecionada != null){
                        break;
                    }
                }
            }


        }

        if (vistaArma == 4) {

            armaSelecionada = mazo;
            atributosDelArma();
            if(armaSelecionada.durabilidad <= 0){
                while(true){
                    armaSelecionada = null;
                    System.out.println("El arma seleccionada esta rota");
                    seleccionarArma(hierro, plata, acero, alma);
                    if(armaSelecionada != null){
                        break;
                    }
                }
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




        if (probabilidadEnemigo <= 50 && probabilidadEnemigo >= 40) {

            MagoMalvado magoMalvado = new MagoMalvado();
            enemigo = magoMalvado;

        }

        if (probabilidadEnemigo <= 40 && probabilidadEnemigo >= 30) {
            Fantasma fantasma = new Fantasma();
            enemigo = fantasma;

        }

        if (probabilidadEnemigo <= 20 && probabilidadEnemigo >= 1) {

            CaballeroSombrio caballeroSombrio = new CaballeroSombrio();
            enemigo = caballeroSombrio;

        }

        if (probabilidadEnemigo <= 5 && probabilidadEnemigo >= 1) {

            DragonMagistral dragonMagistral = new DragonMagistral();
            enemigo = dragonMagistral;

        }

        if(enemigo == null){

            return;
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

                if(armaActual.durabilidad <= 0){

                    while(true){
                        armaActual = null;
                        System.out.println("El arma se rompio selecciona otra.");
                        seleccionarArma(hierro, plata, acero, alma);
                        if(armaActual != null){
                            break;
                        }
                    }
                }
                jugador.vida = jugador.vida - jugador.enemigo.daño;

                if (vida < 0)
                    vida = 0;
                
                armaActual.durabilidad = armaActual.durabilidad - 2;
                if(armaActual.durabilidad <= 0)
                    armaActual.durabilidad = 0;

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
                enemigo = null;
                break;
            }

            if (enemigo.vida <= 0) {
                enemigo.vida = 0;
                enemigo = null;
                int botin = ThreadLocalRandom.current().nextInt(1, (100 + 1));
                int botin2 = ThreadLocalRandom.current().nextInt(1, (3 + 1));
                int botin3 = ThreadLocalRandom.current().nextInt(1, (2 + 1));
                int botin4 = ThreadLocalRandom.current().nextInt(2, 8);

                System.out.println("Felicidades has derrotado al enemigo!");

                if (botin > 5) {

                    System.out.println("BOTIN:");
                    System.out.println("vendas obtenidas [" + botin2 + "]");
                    System.out.println("Hierro obtenido [" + botin3 + "]");
                    System.out.println("Almas obtenidas [" + botin4 + "]");
                    vendas.cantidad = vendas.cantidad + botin2;
                    hierro.cantidad = hierro.cantidad + botin3;
                    alma.cantidad = alma.cantidad + botin4;

                } else {

                    System.out.println("Parace que el enemigo no tenia nada de valor suerte para la proxima :b");
                }

                break;

            }

            if (vida <= 0 || vida <= 0 && enemigo.vida <= 0) {
                enemigo = null;
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
                    vida = vida + 20;
                    break;
                } else if (vivirOMorir == 2) {

                    System.exit(-1);
                }
            }
        }
    }

    public void forjar(Hierro hierro, Carbon carbon, Acero acero) {

        System.out.println("¿Que quieres forjar?");
        System.out.println("[1] para forjar acero");
        System.out.println("[Para el acero necesitas 2 de hierro y 2 de carbon]");
        int forjarOpcion = scanner.getInt();

        if (forjarOpcion == 1) {

            if (hierro.cantidad >= 2 && carbon.cantidad >= 2) {


                hierro.cantidad = hierro.cantidad - 2;
                carbon.cantidad = carbon.cantidad - 2;


                acero.cantidad = acero.cantidad + 1;
                System.out.println("Acero cantidad: " + acero.cantidad);
            } else if (hierro.cantidad < 2) {

                System.out.println("No tienes hierro suficiente.");

            } else if (carbon.cantidad < 2) {

                System.out.println("No tienes carbon suficiente.");

            }
        }
    }
}