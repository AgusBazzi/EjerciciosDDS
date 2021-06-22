import domain.Compuesta;
import domain.Simple;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestBases {

    private Simple baseSimple1;
    private Simple baseSimple2;
    private Simple baseSimple3;
    private Simple baseSimple4;
    private Simple baseSimple5;

    private Compuesta baseCompuesta1;
    private Compuesta baseCompuesta2;
    private Compuesta baseCompuesta3;

    @Before
    public void inicializarBases() {
        this.baseSimple1 = new Simple("Base1", 10, 3, 10);
        this.baseSimple2 = new Simple("Base2", 11, 4, 20);
        this.baseSimple3 = new Simple("Base3", 12, 5, 20);
        this.baseSimple4 = new Simple("Base4", 13, 6, 40);
        this.baseSimple5 = new Simple("Base5", 14, 7, 60);

        this.baseCompuesta3 = new Compuesta("Compuesta3", Stream.of(baseSimple4, baseSimple5).collect(Collectors.toList()));
        this.baseCompuesta2 = new Compuesta("Compuesta2", Stream.of(baseCompuesta3, baseSimple2, baseSimple3).collect(Collectors.toList()));
        this.baseCompuesta1 = new Compuesta("Compuesta1", Stream.of(baseSimple1, baseCompuesta2).collect(Collectors.toList()));

        /* El arbol de prueba seria este, donde H son las hojas y X las compuestas.
         *
         *           X(1)
         *          /    \
         *       H(1)    X(2)
         *             /   |   \
         *           X(3) H(2) H(3)
         *           /  \
         *         H(4) H(5)
         *
         * */

    }

    @Test
    public void cantidadAmbulanciasX1es25() {
        //Total = 3 + 4 + 5 + 6 + 7 = 25
        Assert.assertEquals(25, this.baseCompuesta1.cantAmbulancias());
    }

    @Test
    public void cantidadAmbulanciasX3es13() {
        //Total = 6 + 7 = 13
        Assert.assertEquals(13, this.baseCompuesta3.cantAmbulancias());
    }

    @Test
    public void cantidadDeBasesX1es5() {
        //Total = Tomo en cuenta solo las bases simples, o sea las hojas, H1 + H2 + H3 + H4 + H5 = 5
        Assert.assertEquals(5, this.baseCompuesta1.cantidadDeBasesSimples());
    }

    @Test
    public void tiempoMedioAsistenciaH2es20() {
        Assert.assertEquals(20, this.baseSimple2.tiempoMedioAsistencia());
    }

    @Test
    public void tiempoMedioAsistenciaX3es50() {
        //Total = (40 + 60) / 2 = 50
        Assert.assertEquals(50, this.baseCompuesta3.tiempoMedioAsistencia());
    }

    @Test
    public void tiempoMedioAsistenciaX1es20() {
        // Tiempo X3 = 50
        // Tiempo X2 = (50 + 20 + 20) / 3 = 30
        // Tiempo X1 = (30 + 10) / 2 = 20
        Assert.assertEquals(20, this.baseCompuesta1.tiempoMedioAsistencia());
    }

}



