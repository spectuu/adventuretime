package armas;


public class Arma {

    int balasActuales;
    int cargador;

    public Arma(int balasActuales, int cargador) {
        this.balasActuales = balasActuales;
        this.cargador = cargador;
    }

    public void disparar() {

    }

    public void recargar() {

        if (balasActuales == 0) {


        }
    }

    public void balasActuales() {

        System.out.println("hay " + balasActuales + " bala[s]");

    }


}
