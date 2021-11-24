package Factories.Cuentas;

import Factories.Regalos.CDMusica;
import Factories.TarjetasDebito.Gratuita;

public class Joven extends Cuenta{

    public Joven(){
        this.interes = 2;
        this.regalo = new CDMusica();
        this.tarjetaDebito = new Gratuita();
        this.tarjetaCredito = null;
    }

}
