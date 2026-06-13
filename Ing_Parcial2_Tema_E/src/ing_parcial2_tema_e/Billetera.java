package ing_parcial2_tema_e;
public class Billetera {
    private int id;
    private Conductor titular;
    private double saldo;

    public Billetera(int id, Conductor titular, double saldo) {
        this.id = id;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Billetera() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Conductor getTitular() {
        return titular;
    }

    public void setTitular(Conductor titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void deposito(double monto) {
        this.saldo = saldo + monto;
    }
    
}
