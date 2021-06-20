package domain;

import suscripciones.notificador.GestorSuscriptores;

public class Bateria {

    private boolean conectado;
    private boolean cargando;
    private int nivelDeCarga;
    private int minutosRestantes;

    private final GestorSuscriptores gestorSuscriptores = new GestorSuscriptores();

    //Getters y Setters
    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public boolean isCargando() {
        return cargando;
    }

    public void setCargando(boolean cargando) {
        this.cargando = cargando;
    }

    public int getNivelDeCarga() {
        return nivelDeCarga;
    }

    public void setNivelDeCarga(int nivelDeCarga) {
        this.nivelDeCarga = nivelDeCarga;
        gestorSuscriptores.notificar("Carga",nivelDeCarga);
    }

    public int getMinutosRestantes() {
        return minutosRestantes;
    }

    public void setMinutosRestantes(int minutosRestantes) {
        this.minutosRestantes = minutosRestantes;
        gestorSuscriptores.notificar("Tiempo", minutosRestantes);
    }



}
