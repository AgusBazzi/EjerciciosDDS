package domain;


public class Cuenta {

    private Float saldo;
    private Integer id;

    public Cuenta(Float saldo, Integer id) {
        this.setSaldo(saldo);
        this.setId(id);
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Boolean saldoMayorA(Float valorASuperar){
        return this.saldo >= valorASuperar;
    }


}
