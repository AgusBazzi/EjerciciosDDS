package domain.transportistas;

import domain.envio.Envio;

public abstract class Transportista {

    public abstract Integer calcularCosto(Envio unEnvio);
}

