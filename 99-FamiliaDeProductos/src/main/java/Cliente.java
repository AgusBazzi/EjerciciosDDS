import Factories.Cuentas.*;

public class Cliente implements CreadorCuentas {

    public int edad;
    public boolean nominaDomiciliada;
    public boolean pension;

    public Cuenta cuenta;

    @Override
    public Cuenta crearCuenta(){
        if(this.edad < 25){
            CreadorJoven creator = new CreadorJoven();
            this.cuenta = creator.crearCuenta();
            return this.cuenta;
        }else if(this.edad >= 25 && this.edad <= 65 && nominaDomiciliada){
            CreadorDiez creator = new CreadorDiez();
            this.cuenta = creator.crearCuenta();
            return this.cuenta;
        }else if(this.edad > 65 && pension){
            CreadorOro creator = new CreadorOro();
            this.cuenta = creator.crearCuenta();
            return this.cuenta;
        }else{
            CreadorEstandar creator = new CreadorEstandar();
            this.cuenta = creator.crearCuenta();
            return this.cuenta;
        }
    }

    public void mostrarCuenta(){
        System.out.println("CUENTA DEL CLIENTE '" + this.cuenta.getClass().getSimpleName() + "'");
        System.out.println("\tInteres: " + this.cuenta.interes);

        if(this.cuenta.tieneRegalo())
            System.out.println("\tRegalo: " + this.cuenta.regalo.getClass().getSimpleName());
        else System.out.println("\tNo tiene regalo");

        if(this.cuenta.tieneTarjetaCredito())
            System.out.println("\tTarjeta de credito: " + this.cuenta.tarjetaCredito.getClass().getSimpleName());
        else System.out.println("\tNo tiene tarjeta de credito");

        if(this.cuenta.tieneTarjetaDebito())
            System.out.println("\tTarjeta de debito: " + this.cuenta.tarjetaDebito.getClass().getSimpleName());
        else System.out.println("\tNo tiene tarjeta de debito");

    }

}
