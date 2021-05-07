package domain.transportistas;

import domain.envio.Envio;

public class UPS extends Transportista{

    private Integer multiplicadorPeso = 2;

    public Integer calcularCosto(Envio unEnvio){
        Integer precioPorPeso = unEnvio.getPesoPaquete() * this.multiplicadorPeso;

        Integer precioPorDistancia = unEnvio.getDireccionHasta() - unEnvio.getDireccionDesde();

        return precioPorDistancia + precioPorPeso;
    }
}
