package Factories.Cuentas;

public class CreadorJoven implements CreadorCuentas{
    @Override
    public Cuenta crearCuenta() {
        return new Joven();
    }
}
