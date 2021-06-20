package domain;

import suscripciones.notificador.GestorSuscriptores;
import suscripciones.suscriptor.Suscriptor;

public class Bateria {

    private boolean conectado;
    private boolean cargando;
    private int nivelDeCarga;
    private int minutosRestantes;

    private GestorSuscriptores gestorSuscriptores;

    public Bateria(boolean conectado, boolean cargando, int nivelDeCarga, int minutosRestantes){
        this.setConectado(conectado);
        this.setCargando(cargando);
        this.minutosRestantes = minutosRestantes;
        this.nivelDeCarga = nivelDeCarga;
        this.gestorSuscriptores = new GestorSuscriptores("Carga", "Tiempo");
    }

    public void agregarSuscriptor(String tipo, Suscriptor unSuscriptor){
        gestorSuscriptores.agregarSuscriptor(tipo, unSuscriptor);
    }


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
        gestorSuscriptores.notificar("Carga", nivelDeCarga);
    }

    public int getMinutosRestantes() {
        return minutosRestantes;
    }

    public void setMinutosRestantes(int minutosRestantes) {
        this.minutosRestantes = minutosRestantes;
        gestorSuscriptores.notificar("Tiempo", minutosRestantes);
    }



}
