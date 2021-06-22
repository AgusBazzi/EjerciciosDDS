package suscripciones.notificador;

import suscripciones.suscriptor.Suscriptor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorSuscriptores {

    private Map<String, ArrayList<Suscriptor>> suscriptores;

    public GestorSuscriptores(String... tipos){
        suscriptores = new HashMap<>();
        for(String tipo : tipos){
            this.suscriptores.put(tipo, new ArrayList<>());
        }
    }

    public void agregarSuscriptor(String tipo, Suscriptor unSuscriptor){
        if(suscriptores.containsKey(tipo)){
            ArrayList<Suscriptor> observadores = suscriptores.get(tipo);
            observadores.add(unSuscriptor);
        }
    }

    public void eliminarSuscriptor(String tipo, Suscriptor unSuscriptor){
        ArrayList<Suscriptor> observadores = suscriptores.get(tipo);
        observadores.remove(unSuscriptor);
    }

    public void notificar(String tipo, int notificacion){
        if(suscriptores.containsKey(tipo)){
            ArrayList<Suscriptor> observadores = suscriptores.get(tipo);
            for(Suscriptor unSuscriptor : observadores){
                unSuscriptor.actualizar(notificacion);
            }
        }
    }

    //Agrego este metodo para los tests
    public int cantSuscriptoresSegunTema(String tipo) {
        return suscriptores.get(tipo).size();
    }

}
