package visitor;

import business.CajaDeAhorro;
import business.CuentaCorriente;
import business.TarjetaDeCredito;

public class VisitorCalculoIntereses implements Visitor {

    @Override
    public void visitarTarjetaDeCredito(TarjetaDeCredito unaTarjeta) {
        Float interesesFinales = 105/100 * unaTarjeta.getIntereses();
        unaTarjeta.setIntereses(interesesFinales);
    }

    @Override
    public void visitarCuentaCorriente(CuentaCorriente unaCuentaCorriente) {
        Float montoFinal = 99/100 * unaCuentaCorriente.getMonto();
        unaCuentaCorriente.setMonto(montoFinal);
    }

    @Override
    public void visitarCajaDeAhorro(CajaDeAhorro unaCajaDeAhorro) {
        Float montoFinal = 99/100 * unaCajaDeAhorro.getMonto();
        unaCajaDeAhorro.setMonto(montoFinal);
    }
}
