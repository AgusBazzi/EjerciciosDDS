package control;

import domain.Cliente;
import domain.Cuenta;

import java.util.ArrayList;
import java.util.List;

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
        List<Cuenta> cuentasObjetivo = clienteObjetivo.cuentasQueSuperan(valorASuperar);

        return cuentasObjetivo.size();
    }

    private Cliente buscarCliente(String dni){
        return clientes
                .stream()
                .filter( cliente -> cliente.getDNI().equals(dni))
                .findFirst()
                .orElse(null);
    }

    public void addClientes(List<Cliente> clientes) {
        this.clientes.addAll(clientes);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}
