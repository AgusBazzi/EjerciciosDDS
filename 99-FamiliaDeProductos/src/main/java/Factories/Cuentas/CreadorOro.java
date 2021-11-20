package Factories.Cuentas;

public class CreadorOro implements CreadorCuentas{
    @Override
    public Cuenta crearCuenta() {
        return new Oro();
    }
}
