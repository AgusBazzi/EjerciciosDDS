package domain.transportistas;

import domain.envio.Envio;

public class FedEx extends Transportista{

    private Integer multiplicador = 2;

    public Integer calcularCosto(Envio unEnvio){
        return unEnvio.getPesoPaquete()*this.multiplicador;
    }
}
