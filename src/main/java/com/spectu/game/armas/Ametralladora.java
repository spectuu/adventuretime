package com.spectu.game.armas;

public class Ametralladora extends Arma {

    public Ametralladora() {
        super(30, 30, 5);
    }

    @Override
    public void disparar() {

        balasActuales = balasActuales-10;

    }

    @Override
    public void recargar() {

        if (balasActuales == 0) {

            balasActuales = balasActuales+cargador;

        }

    }
}
