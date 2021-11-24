package Factories.Cuentas;

import Factories.TarjetasDebito.Paga;

public class Estandar extends Cuenta{

    public Estandar(){
        this.interes = 0.5;
        this.tarjetaDebito = new Paga();
        this.regalo = null;
        this.tarjetaCredito = null;
    }

}
