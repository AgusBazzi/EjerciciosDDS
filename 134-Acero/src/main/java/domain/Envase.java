package domain;

public class Envase {

    private TipoArticulo tipoArticulo;
    private Capacidad capacidad;

    public Capacidad getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Capacidad capacidad) {
        this.capacidad = capacidad;
    }

    public Envase(TipoArticulo tipoArticulo, Capacidad capacidad) {
        this.capacidad = capacidad;
        this.tipoArticulo = tipoArticulo;
    }


}
