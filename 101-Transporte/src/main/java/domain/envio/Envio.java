package domain.envio;

import domain.transportistas.Transportista;

public class Envio {

    private Integer direccionDesde;
    private Integer direccionHasta;

    private Integer pesoPaquete;

    private Transportista transportista;

    public Integer getDireccionDesde() {
        return direccionDesde;
    }

    public void setDireccionDesde(Integer unaDireccion) {
        this.direccionDesde = unaDireccion;
    }

    public Integer getDireccionHasta() {
        return direccionHasta;
    }

    public void setDireccionHasta(Integer unaDireccion) {
        this.direccionHasta = unaDireccion;
    }

    public Integer getPesoPaquete() {
        return pesoPaquete;
    }

    public void setPesoPaquete(Integer unPesoPaquete) {
        this.pesoPaquete = unPesoPaquete;
    }

    public Transportista getTransportista() {
        return transportista;
    }

    public void setTransportista(Transportista unTransportista) {
        this.transportista = unTransportista;
    }

    public Integer calcularCosto(){
        return this.transportista.calcularCosto(this);
    }

    public Envio(Integer dirDesde, Integer dirHasta, Integer pesoPaquete, Transportista transportista){
        this.setDireccionDesde(dirDesde);
        this.setDireccionHasta(dirHasta);
        this.setPesoPaquete(pesoPaquete);
        this.setTransportista(transportista);
    }

}
