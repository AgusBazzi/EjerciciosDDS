package domain;


public class Cuenta {

    private Float saldo;
    private Integer id;

    public Cuenta(Float saldo, Integer id) {
        this.setSaldo(saldo);
        this.setId(id);
    }

    public void setSaldo(Float unSaldo) {
        this.saldo = unSaldo;
    }

    public void setId(Integer unId) {
        this.id = unId;
    }

    public Integer getId() {
        return id;
    }

    public Boolean saldoMayorA(Float valorASuperar){
        return this.saldo >= valorASuperar;
    }


}
