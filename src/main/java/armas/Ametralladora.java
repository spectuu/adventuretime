package armas;

public class Ametralladora extends Arma{

    @Override
    public void disparar(){

    Arma.numeroDeBalasActuales = 20;
    Arma.cargador = 20;

    numeroDeBalasActuales = numeroDeBalasActuales-20;

    }
    @Override
    public void recargar() {

        if (numeroDeBalasActuales == 0) {

        numeroDeBalasActuales = cargador+numeroDeBalasActuales;

          }
        }
    }
