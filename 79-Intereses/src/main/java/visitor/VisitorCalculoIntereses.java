package visitor;

import business.CajaDeAhorro;
import business.CuentaCorriente;
import business.TarjetaDeCredito;

public class VisitorCalculoIntereses implements Visitor {

    @Override
    public void visitarTarjetaDeCredito(TarjetaDeCredito unaTarjeta) {
        Float interesesFinales = 105F / 100F * unaTarjeta.getIntereses();
        unaTarjeta.setIntereses(interesesFinales);
    }

    @Override
    public void visitarCuentaCorriente(CuentaCorriente unaCuentaCorriente) {
        Float montoFinal = 99F / 100F * unaCuentaCorriente.getMonto();
        unaCuentaCorriente.setMonto(montoFinal);
    }

    @Override
    public void visitarCajaDeAhorro(CajaDeAhorro unaCajaDeAhorro) {
        Float montoFinal = 99F / 100F * unaCajaDeAhorro.getMonto();
        unaCajaDeAhorro.setMonto(montoFinal);
    }
}
