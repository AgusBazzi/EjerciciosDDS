package domain;

import domain.envio.Envio;
import domain.transportistas.FedEx;
import domain.transportistas.TransportistaDefault;
import domain.transportistas.UPS;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestEnvios{

    private Envio envio1;
    private Envio envio2;
    private Envio envio3;

    @Before
    public void inicializarEnvios(){
        this.envio1 = new Envio(0, 10, 6, new FedEx());
        this.envio2 = new Envio(5, 10, 3, new UPS());
        this.envio3 = new Envio(7, 19, 9, new TransportistaDefault());

    }

    @Test
    public void envio1Cuesta12(){
        Assert.assertEquals(12, this.envio1.calcularCosto().intValue());
    }

    @Test
    public void envio2Cuesta11(){
        Assert.assertEquals(11, this.envio2.calcularCosto().intValue());
    }

    @Test
    public void envio3Cuesta12(){
        Assert.assertEquals(12, this.envio3.calcularCosto().intValue());
    }
}
