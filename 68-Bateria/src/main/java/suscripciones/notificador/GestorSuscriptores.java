package suscripciones.notificador;

import suscripciones.suscriptor.Suscriptor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorSuscriptores {

    private Map<String, List<Suscriptor>> suscriptores = new HashMap<>();

    public void agregarSuscriptor(String tipo, Suscriptor unSuscriptor){
        List<Suscriptor> observadores = suscriptores.get(tipo);
        observadores.add(unSuscriptor);
    }

    public void eliminarSuscriptor(String tipo, Suscriptor unSuscriptor){
        List<Suscriptor> observadores = suscriptores.get(tipo);
        observadores.remove(unSuscriptor);
    }

    public void notificar(String tipo, int notificacion){
        List<Suscriptor> observadores = suscriptores.get(tipo);
        for(Suscriptor unSuscriptor : observadores){
            unSuscriptor.actualizar(notificacion);
        }
    }

}
