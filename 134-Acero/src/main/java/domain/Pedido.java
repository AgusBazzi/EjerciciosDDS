package domain;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {

    private int id;
    private Date fechaPrimerEntrega;
    private int cantidadEntregas;
    private Periodicidad periodicidad;
    private ArrayList<Entrega> listaEntregas;

    public Pedido(Date fechaPrimeraEntrega, int cantidadEntregas, Periodicidad periodicidad, ArrayList<Entrega> listaEntregas, int id){
        this.fechaPrimerEntrega = fechaPrimeraEntrega;
        this.cantidadEntregas = cantidadEntregas;
        this.periodicidad = periodicidad;
        this.id = id;
    }


}
