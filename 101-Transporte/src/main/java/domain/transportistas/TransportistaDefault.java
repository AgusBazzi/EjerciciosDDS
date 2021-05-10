package domain.transportistas;

import domain.envio.Envio;

public class TransportistaDefault extends Transportista {

    public Integer calcularCosto(Envio unEnvio){
        return unEnvio.getDireccionHasta() - unEnvio.getDireccionDesde();
    }
}
