package Factories.Cuentas;

import Factories.Regalos.ReproductorCD;
import Factories.TarjetasCredito.Paga;
import Factories.TarjetasDebito.Gratuita;

public class Diez extends Cuenta{

    public int descubierto = 50;

    public Diez(){
        this.interes = 1;
        this.regalo = new ReproductorCD();
        this.tarjetaDebito = new Gratuita();
        this.tarjetaCredito = new Paga();
    }

}
