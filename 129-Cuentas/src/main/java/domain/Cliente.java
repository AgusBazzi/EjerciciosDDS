package domain;

import java.util.ArrayList;
import java.util.List;


public class Cliente {

    private String DNI;
    private List<Cuenta> cuentas;

    public Cliente(String DNI){
        this.setDNI(DNI);
        this.setCuentas(new ArrayList<>());
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
}
