package control;

import domain.Cliente;
import domain.Cuenta;
import org.junit.Before;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class BaseTest {

    protected List<Cuenta> cuentas;
    protected List<Cliente> clientes;
    protected ControlCuentas control;

    protected BaseTest() {
        this.cuentas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    @Before
    public void inicializar(){
        this.inicializarCuentas();
        this.inicializarClientes();
        this.inicializarControl();

        this.asignarCuentas();
        this.asignarClientes();
    }

    private void inicializarCuentas() {
        Cuenta[] cuentas = {
                new Cuenta(150.50F, 1),
                new Cuenta(180.75F, 2),
                new Cuenta(225.50F, 3),
                new Cuenta(100.00F, 4),
                new Cuenta(220.60F, 5),
                new Cuenta(300.50F, 6)
        };
        Collections.addAll(this.cuentas, cuentas);
    }

    private void inicializarClientes() {
        Cliente[] clientes = {
                new Cliente("40000001"),
                new Cliente("40000002"),
                new Cliente("40000003")
        };
        Collections.addAll(this.clientes, clientes);
    }

    private void inicializarControl() {
        control = ControlCuentas.getInstance();
    }

    private void asignarCuentas(){
        Cliente cliente1 = buscarCliente("40000001");
        cliente1.addCuentas(this.buscarCuenta(1),
                            this.buscarCuenta(2),
                            this.buscarCuenta(3));

        Cliente cliente2 = buscarCliente("40000002");
        cliente2.addCuentas(this.buscarCuenta(4),
                            this.buscarCuenta(5));

        Cliente cliente3 = buscarCliente("40000003");
        cliente3.addCuentas(this.buscarCuenta(6));
    }

    private void asignarClientes(){
        control.addClientes(this.clientes);
    }

    protected Cuenta buscarCuenta(Integer id){
        return cuentas
                .stream()
                .filter( c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    protected Cliente buscarCliente(String dni){
        return clientes
                .stream()
                .filter( cliente -> cliente.getDNI().equals(dni))
                .findFirst()
                .orElse(null);
    }


}
