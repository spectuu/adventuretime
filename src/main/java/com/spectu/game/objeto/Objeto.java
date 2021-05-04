package com.spectu.game.objeto;

public class Objeto {

    public String tipoDeObjeto;
    public  String Funcion;
    public int cantidad;

    public Objeto(String tipoDeObjeto, String funcion, int cantidad){

        this.cantidad = cantidad;
        this.tipoDeObjeto = tipoDeObjeto;
        this.Funcion = funcion;

    }
    
}
