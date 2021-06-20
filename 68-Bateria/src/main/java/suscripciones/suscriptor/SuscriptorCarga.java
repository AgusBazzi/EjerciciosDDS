package suscripciones.suscriptor;

public class SuscriptorCarga implements Suscriptor{

    private int nivelDeCarga;

    @Override
    public void actualizar(int nivelDeCarga) {
        this.nivelDeCarga = nivelDeCarga;
    }
}
