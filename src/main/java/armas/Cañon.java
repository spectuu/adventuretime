package armas;

public class Cañon extends Arma {


    @Override
    public void disparar(){

        Arma.numeroDeBalasActuales = 3;
        Arma.cargador = 3;

        numeroDeBalasActuales = numeroDeBalasActuales-3;

    }

    @Override
    public void recargar(){

        if(numeroDeBalasActuales == 0){

            numeroDeBalasActuales = numeroDeBalasActuales+cargador;

        }
    }

}
