package suscripciones.suscriptor;

public class SuscriptorTiempo implements Suscriptor{

    private int minutosRestantes;

    public int getMinutosRestantes() {
        return minutosRestantes;
    }

    @Override
    public void actualizar(int minutosRestantes) {
        this.minutosRestantes = minutosRestantes;
    }

}
