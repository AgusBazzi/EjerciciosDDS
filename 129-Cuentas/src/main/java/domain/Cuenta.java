package domain;

public class Cuenta {

    private Integer saldo;

    public Cuenta(Integer saldo) {
        this.setSaldo(saldo);
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }
}
