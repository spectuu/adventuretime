package armas;

public class Ametralladora extends Arma{


    public static Ametralladora armaActual;
    int numeroDeBalasActuales = 20;

    @Override
    public void disparar(){

        numeroDeBalasActuales = numeroDeBalasActuales-5;

    }
    @Override
    public void recargar() {

        if (numeroDeBalasActuales == 0) {

            numeroDeBalasActuales = numeroDeBalasActuales+20;

        }

    }
    }
