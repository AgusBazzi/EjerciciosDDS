package domain;

import exceptions.EntregaNoEncontradaException;
import exceptions.EnvaseNoEncontradoException;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

public class Pedido {

    private String id;
    private Date fechaPrimerEntrega;
    private int cantidadEntregas;
    private Periodicidad periodicidad;
    private ArrayList<Entrega> listaEntregas;

    public Pedido(Date fechaPrimeraEntrega, int cantidadEntregas, Periodicidad periodicidad, ArrayList<Entrega> listaEntregas, String id){
        this.fechaPrimerEntrega = fechaPrimeraEntrega;
        this.cantidadEntregas = cantidadEntregas;
        this.periodicidad = periodicidad;
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void agregarArtPedido(ArtPedido artPedido, Date unaFecha) {
        Entrega entrega = buscarEntregaSegun(unaFecha);
        entrega.agregarArtPedido(artPedido);
    }

    private Entrega buscarEntregaSegun(Date unaFecha) {
        return listaEntregas.stream()
                .filter(unaEntrega -> unaEntrega.getFechaEntrega().equals(unaFecha))
                .findFirst()
                .orElseThrow( () -> new EntregaNoEncontradaException(String.format("No existe una entrega con esa fecha")));
    }
}
