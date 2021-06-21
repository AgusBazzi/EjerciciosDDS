import domain.Bateria;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import suscripciones.suscriptor.SuscriptorCarga;
import suscripciones.suscriptor.SuscriptorTiempo;

public class TestBateria {

    private Bateria bateria;
    private SuscriptorCarga suscriptorCarga1;
    private SuscriptorCarga suscriptorCarga2;
    private SuscriptorTiempo suscriptorTiempo1;

    @Before
    public void inicializar(){
        this.suscriptorCarga1 = new SuscriptorCarga();
        this.suscriptorTiempo1 = new SuscriptorTiempo();
        this.suscriptorCarga2 = new SuscriptorCarga();
        this.bateria = new Bateria(true, true, 12, 87);
        this.bateria.agregarSuscriptor("Carga", suscriptorCarga1);
        this.bateria.agregarSuscriptor("Tiempo", suscriptorTiempo1);
    }

    @Test
    public void seNotificanLosMinutosRestantes() {
        bateria.setMinutosRestantes(54);
        Assert.assertEquals(54, suscriptorTiempo1.getMinutosRestantes());
    }

    @Test
    public void seNotificaElNivelDeCarga() {
        bateria.setNivelDeCarga(45);
        Assert.assertEquals(45, suscriptorCarga1.getNivelDeCarga());
    }

    @Test
    public void cantidadDeSuscriptores() {
        //Al principio hay 1 suscriptor en "Carga" y 1 en "Tiempo"
        Assert.assertEquals(1, bateria.cantSuscriptoresSegunTema("Carga"));
        Assert.assertEquals(1, bateria.cantSuscriptoresSegunTema("Tiempo"));

        //Agrego 1 suscriptor en "Carga" y elimino al de "Tiempo"
        bateria.agregarSuscriptor("Carga", suscriptorCarga2);
        bateria.eliminarSuscriptor("Tiempo", suscriptorTiempo1);

        Assert.assertEquals(2, bateria.cantSuscriptoresSegunTema("Carga"));
        Assert.assertEquals(0, bateria.cantSuscriptoresSegunTema("Tiempo"));
    }

}
