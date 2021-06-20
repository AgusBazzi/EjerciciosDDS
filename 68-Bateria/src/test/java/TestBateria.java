import domain.Bateria;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import suscripciones.suscriptor.SuscriptorCarga;
import suscripciones.suscriptor.SuscriptorTiempo;

public class TestBateria {

    private Bateria bateria;
    private SuscriptorCarga suscriptorCarga;
    private SuscriptorTiempo suscriptorTiempo;

    @Before
    public void inicializar(){
        this.suscriptorCarga = new SuscriptorCarga();
        this.suscriptorTiempo = new SuscriptorTiempo();
        this.bateria = new Bateria(true, true, 12, 87);
        this.bateria.agregarSuscriptor("Carga", suscriptorCarga);
        this.bateria.agregarSuscriptor("Tiempo", suscriptorTiempo);
    }

    @Test
    public void seNotificanLosMinutosRestantes() {
        bateria.setMinutosRestantes(54);
        Assert.assertEquals(54, suscriptorTiempo.getMinutosRestantes());
    }

    @Test
    public void seNotificaElNivelDeCarga() {
        bateria.setNivelDeCarga(45);
        Assert.assertEquals(45, suscriptorCarga.getNivelDeCarga());
    }

}
