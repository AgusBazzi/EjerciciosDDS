package domain.envio;

import domain.transportistas.Transportista;

public class Envio {

    private Integer direccionDesde;
    private Integer direccionHasta;

    private Integer pesoPaquete;

    private Transportista estrategia;

    public Integer getDireccionDesde() {
        return direccionDesde;
    }

    public void setDireccionDesde(Integer direccionDesde) {
        this.direccionDesde = direccionDesde;
    }

    public Integer getDireccionHasta() {
        return direccionHasta;
    }

    public void setDireccionHasta(Integer direccionHasta) {
        this.direccionHasta = direccionHasta;
    }

    public Integer getPesoPaquete() {
        return pesoPaquete;
    }

    public void setPesoPaquete(Integer pesoPaquete) {
        this.pesoPaquete = pesoPaquete;
    }

    public Transportista getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(Transportista estrategia) {
        this.estrategia = estrategia;
    }

    public Integer calcularCosto(){
        return this.estrategia.calcularCosto(this);
    }

    public Envio(Integer dd, Integer dh, Integer pp, Transportista transportista ){
        this.direccionDesde = dd;
        this.direccionHasta = dh;
        this.pesoPaquete = pp;
        this.estrategia = transportista;
    }

}
