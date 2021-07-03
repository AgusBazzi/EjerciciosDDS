package business;

import visitor.Visitado;
import visitor.Visitor;

public class CajaDeAhorro implements Visitado {

    private Float monto;

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float unMonto) {
        this.monto = unMonto;
    }

    @Override
    public void aceptarVisitor(Visitor unVisitor) {
        unVisitor.visitarCajaDeAhorro(this);
    }

}
