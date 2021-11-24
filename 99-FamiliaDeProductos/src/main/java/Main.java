public class Main {
    public static void main(String[] args){
        //Clients
        Cliente joven = new Cliente();
        Cliente diez = new Cliente();
        Cliente oro = new Cliente();
        Cliente estandar = new Cliente();

        //Settings
        joven.edad = 18;

        diez.edad = 40;
        diez.nominaDomiciliada = true;

        oro.edad = 70;
        oro.pension = true;

        estandar.edad = 35;
        estandar.nominaDomiciliada = false;

        //Create accounts
        joven.crearCuenta();
        diez.crearCuenta();
        oro.crearCuenta();
        estandar.crearCuenta();

        //Show accounts
            //Joven
        joven.mostrarCuenta();
            //Diez
        diez.mostrarCuenta();
            //Oro
        oro.mostrarCuenta();
            //Estandar
        estandar.mostrarCuenta();

    }
}
