package visitor;

import business.CajaDeAhorro;
import business.CuentaCorriente;
import business.TarjetaDeCredito;

public interface Visitor {

    public void visitarTarjetaDeCredito(TarjetaDeCredito unaTarjeta);
    public void visitarCuentaCorriente(CuentaCorriente unaCuentaCorriente);
    public void visitarCajaDeAhorro(CajaDeAhorro unaCajaDeAhorro);

}
