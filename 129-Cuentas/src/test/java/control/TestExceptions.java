package control;

import exceptions.ClienteNoEncontradoException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestExceptions extends BaseTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testClientNoEncontradoException() {

        String dniErroneo = "40000004";

        thrown.expect(ClienteNoEncontradoException.class);
        thrown.expectMessage(String.format("No existe un cliente con el dni %s", dniErroneo));

        control.chequearCuentas(dniErroneo, 100F);
    }
}
