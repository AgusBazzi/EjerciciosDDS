package Factories.Cuentas;

import Factories.Regalos.Seguro;
import Factories.TarjetasDebito.Gratuita;

public class Oro extends Cuenta{

    public Oro(){
        this.interes = 1.5;
        this.regalo = new Seguro();
        this.tarjetaDebito = new Gratuita();
        //To avoid clash
        this.tarjetaCredito = new Factories.TarjetasCredito.Gratuita();
    }

}
