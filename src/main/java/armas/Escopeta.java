package armas;

public class Escopeta extends Arma{

    @Override
    public void disparar(){

        Arma.numeroDeBalasActuales = 15;
        Arma.cargador = 15;

        numeroDeBalasActuales = numeroDeBalasActuales-15;

    }

    @Override
    public void recargar(){

        if(numeroDeBalasActuales == 0){

            numeroDeBalasActuales = numeroDeBalasActuales+cargador;

        }

    }


}
