package Factories.Cuentas;

import Factories.Regalos.Regalo;
import Factories.TarjetasCredito.TarjetaCredito;
import Factories.TarjetasDebito.TarjetaDebito;

public abstract class Cuenta {

    public double interes;

    public Regalo regalo;
    public TarjetaCredito tarjetaCredito;
    public TarjetaDebito tarjetaDebito;

    public boolean tieneRegalo(){
        return regalo != null;
    }
    public boolean tieneTarjetaCredito(){
        return tarjetaCredito != null;
    }
    public boolean tieneTarjetaDebito(){
        return tarjetaCredito != null;
    }

}
