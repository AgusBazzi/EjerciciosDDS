package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


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

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> unasCuentas) {
        this.cuentas = unasCuentas;
    }

    public void addCuentas(Cuenta ... unasCuentas) {
        Collections.addAll(this.cuentas, unasCuentas);
    }
}
