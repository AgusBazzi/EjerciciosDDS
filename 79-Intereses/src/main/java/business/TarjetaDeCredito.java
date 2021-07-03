package business;

import visitor.Visitado;
import visitor.Visitor;

public class TarjetaDeCredito implements Visitado {

    private Float intereses;

    public Float getIntereses() {
        return intereses;
    }

    public void setIntereses(Float unosIntereses) {
        this.intereses = unosIntereses;
    }

    @Override
    public void aceptarVisitor(Visitor unVisitor) {
        unVisitor.visitarTarjetaDeCredito(this);
    }

}
