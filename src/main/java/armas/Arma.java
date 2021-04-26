package armas;


public class Arma {

    public static Ametralladora armaActual;
   Ametralladora ametralladora;
    Arma escopeta;
    Arma cañon;
    int damage;

    int numeroDeBalasActuales = 29;

    public void disparar() {

       numeroDeBalasActuales = numeroDeBalasActuales-29;
    }

    public void recargar() {

        if (numeroDeBalasActuales < 29) {

            numeroDeBalasActuales = numeroDeBalasActuales+29;

        }

    }

    public void balasActuales() {

        System.out.println(numeroDeBalasActuales);

    }


}
