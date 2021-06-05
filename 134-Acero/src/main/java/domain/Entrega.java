package domain;

import java.util.ArrayList;
import java.util.Date;

public class Entrega {

    private Date fechaEntrega;
    private ArrayList<ArtPedido> articulos;

    public Entrega(Date fecha) {
        this.fechaEntrega = fecha;
        this.articulos = new ArrayList<>();
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void agregarArtPedido(ArtPedido artPedido) {
        articulos.add(artPedido);
    }
}
