package Factories.Cuentas;

public class CreadorDiez implements CreadorCuentas{
    @Override
    public Cuenta crearCuenta() {
        return new Diez();
    }
}
