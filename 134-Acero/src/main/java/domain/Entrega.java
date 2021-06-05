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
}
