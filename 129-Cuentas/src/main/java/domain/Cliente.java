package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Cliente {

    private String dni;
    private List<Cuenta> cuentas;

    public Cliente(String dni){
        this.setDNI(dni);
        this.setCuentas(new ArrayList<>());
    }

    public String getDNI() {
        return dni;
    }

    public void setDNI(String unDni) {
        this.dni = unDni;
    }

    public void setCuentas(List<Cuenta> unasCuentas) {
        this.cuentas = unasCuentas;
    }

    public void addCuentas(Cuenta ... unasCuentas) {
        Collections.addAll(this.cuentas, unasCuentas);
    }

    public List<Cuenta> cuentasQueSuperan(Float valorASuperar){
        return cuentas
                .stream()
                .filter( cuenta -> cuenta.saldoMayorA(valorASuperar))
                .collect(Collectors.toList());
    }
}
