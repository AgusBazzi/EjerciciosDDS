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

    public void setDNI(String dni) {
        this.dni = dni;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public void addCuentas(Cuenta ... cuentas) {
        Collections.addAll(this.cuentas, cuentas);
    }

    public List<Cuenta> cuentasQueSuperan(Float valorASuperar){
        return cuentas
                .stream()
                .filter( cuenta -> cuenta.saldoMayorA(valorASuperar))
                .collect(Collectors.toList());
    }
}
