package com.spectu.game.objeto;

public class Inventario {

    public Objeto[] objetos;

    public Inventario(Objeto...objetos) {
        this.objetos = objetos;
    }
    public void mostrarInventario() {
        for(int i = 0; i < objetos.length; i++){
            Objeto objeto = objetos[i];
            System.out.println("[" + objeto.cantidad + "] " + objeto.tipoDeObjeto);
        }
    }

    public Carbon getCarbon() {
        return (Carbon) getByName("Carbon");
    }

    public Plata getPlata() {
        return (Plata) getByName("Plata");
    }

    public Medicina getMedicina() {
        return (Medicina)  getByName("Vendas");
    }

    public Acero getAcero() {
        return (Acero) getByName("Acero");
    }

    public Hierro getHierro() {
        return (Hierro) getByName("Hierro");
    }

    public Alma getAlma() {
        return (Alma) getByName("Alma");
    }

    public Objeto getByName(String name) {
        for(Objeto objeto : objetos) {
            if(objeto.tipoDeObjeto.equals(name)) {
                return objeto;
            }
        }
        return null;
    }

}
