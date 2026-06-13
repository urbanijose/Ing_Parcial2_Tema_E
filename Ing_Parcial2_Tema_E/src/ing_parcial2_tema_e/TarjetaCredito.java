package ing_parcial2_tema_e;

import java.time.LocalDate;

public class TarjetaCredito {
    private long numero;
    private String tipo;
    private String titular;
    private LocalDate caducidad;
    private int ccv;

    public TarjetaCredito(long numero, String tipo, String titular, LocalDate caducidad, int ccv) {
        this.numero = numero;
        this.tipo = tipo;
        this.titular = titular;
        this.caducidad = caducidad;
        this.ccv = ccv;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    public int getCcv() {
        return ccv;
    }

    public void setCcv(int ccv) {
        this.ccv = ccv;
    }
    
    
}
