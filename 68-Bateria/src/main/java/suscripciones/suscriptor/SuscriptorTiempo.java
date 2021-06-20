package suscripciones.suscriptor;

public class SuscriptorTiempo implements Suscriptor{

    private int minutosRestantes;

    @Override
    public void actualizar(int minutosRestantes) {
        this.minutosRestantes = minutosRestantes;
    }

}
