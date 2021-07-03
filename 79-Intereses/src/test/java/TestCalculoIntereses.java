import business.CajaDeAhorro;
import business.CuentaCorriente;
import business.TarjetaDeCredito;
import org.junit.Assert;
import org.junit.Test;
import visitor.VisitorCalculoIntereses;

public class TestCalculoIntereses {

    @Test
    public void las_tarjetas_aumentan_5_porcienteo_sus_intereses() {

        TarjetaDeCredito nuevaTarjeta = new TarjetaDeCredito();
        VisitorCalculoIntereses nuevoVisitor = new VisitorCalculoIntereses();

        nuevaTarjeta.setIntereses(2000F);
        nuevaTarjeta.aceptarVisitor(nuevoVisitor);

        Assert.assertEquals(2100F, nuevaTarjeta.getIntereses(), 0F);
    }

    @Test
    public void las_cuentas_corrientes_disminuyen_1_porciento_sus_montos() {
        CuentaCorriente nuevaCuentaCorriente = new CuentaCorriente();
        VisitorCalculoIntereses nuevoVisitor = new VisitorCalculoIntereses();

        nuevaCuentaCorriente.setMonto(4500F);
        nuevaCuentaCorriente.aceptarVisitor(new VisitorCalculoIntereses());

        Assert.assertEquals(4455F, nuevaCuentaCorriente.getMonto(), 0F);
    }

    @Test
    public void las_cajas_de_ahorro_disminuyen_1_porciento_sus_montos() {
        CajaDeAhorro nuevaCajaDeAhorro = new CajaDeAhorro();
        VisitorCalculoIntereses nuevoVisitor = new VisitorCalculoIntereses();

        nuevaCajaDeAhorro.setMonto(6000F);
        nuevaCajaDeAhorro.aceptarVisitor(new VisitorCalculoIntereses());

        Assert.assertEquals(5940F, nuevaCajaDeAhorro.getMonto(), 0F);
    }

}
