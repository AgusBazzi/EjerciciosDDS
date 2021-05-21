package control;

import domain.Cliente;
import domain.Cuenta;
import exceptions.ClienteNoEncontradoException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ControlCuentas {

    private static ControlCuentas instance = null;
    private List<Cliente> clientes;

    private ControlCuentas() {}

    public static ControlCuentas getInstance() {
        if(instance == null){
            instance = new ControlCuentas();
            instance.clientes = new ArrayList<>();
        }
        return instance;
    }

    public Integer chequearCuentas(String dniCliente, Float valorASuperar){
        Cliente clienteObjetivo = this.buscarCliente(dniCliente);
        List<Cuenta> cuentasObjetivo = clienteObjetivo.getCuentas();
        List<Cuenta> cuentasValidas = this.cuentasQueSuperan(cuentasObjetivo, valorASuperar);

        return cuentasValidas.size();
    }

    private Cliente buscarCliente(String unDni){
        return clientes
                .stream()
                .filter( cliente -> cliente.getDNI().equals(unDni))
                .findFirst()
                .orElseThrow( () -> new ClienteNoEncontradoException(String.format("No existe un cliente con el dni %s", unDni)));
    }

    private List<Cuenta> cuentasQueSuperan(List<Cuenta> unasCuentas, Float valorASuperar){
        return unasCuentas
                .stream()
                .filter( cuenta -> cuenta.getSaldo() >= valorASuperar)
                .collect(Collectors.toList());
    }

    public void addClientes(List<Cliente> unosClientes) {
        this.clientes.addAll(unosClientes);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
