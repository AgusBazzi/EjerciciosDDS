package domain;


public class Cuenta {

    private Float saldo;
    private Integer id;

    public Cuenta(Float saldo, Integer id) {
        this.setSaldo(saldo);
        this.setId(id);
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float unSaldo) {
        this.saldo = unSaldo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer unId) {
        this.id = unId;
    }





}
