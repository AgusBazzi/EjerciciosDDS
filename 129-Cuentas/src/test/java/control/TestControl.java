package control;

import org.junit.Assert;
import org.junit.Test;


public class TestControl extends BaseTest {

    @Test
    public void controlTieneClientes(){
        Assert.assertFalse(control.getClientes().isEmpty());
    }

    @Test
    public void cliente1Tiene2CuentasMayoresA160(){
        Assert.assertEquals(2, control.chequearCuentas("40000001", 160F).intValue());
        // Cuentas de cliente1:     150.50      180.75      225.50
    }

    @Test
    public void cliente2Tiene1CuentaMayorA160(){
        Assert.assertEquals(1, control.chequearCuentas("40000002", 160F).intValue());
        // Cuentas de cliente2:     100.00      220.60
    }

    @Test
    public void cliente3Tiene0CuentaMayorA500(){
        Assert.assertEquals(0, control.chequearCuentas("40000003", 500F).intValue());
        // Cuentas de cliente3:     300.50
    }

}
