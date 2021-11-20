package Factories.Cuentas;

public class CreadorEstandar implements CreadorCuentas{
    @Override
    public Cuenta crearCuenta() {
        return new Estandar();
    }
}
