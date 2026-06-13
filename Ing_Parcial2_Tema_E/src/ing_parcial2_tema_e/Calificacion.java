package ing_parcial2_tema_e;
public class Calificacion {
    private int id;
    private Viaje viaje;
    private double puntaje;
    private String motivo;
    private String elogio;
    private UsrCuenta emisor;
    private UsrCuenta receptor;

    public Calificacion(int id, Viaje viaje, double puntaje, String motivo, String elogio, UsrCuenta emisor, UsrCuenta receptor) {
        this.id = id;
        this.viaje = viaje;
        this.puntaje = puntaje;
        this.motivo = motivo;
        this.elogio = elogio;
        this.emisor = emisor;
        this.receptor = receptor;
    }

    public Calificacion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getElogio() {
        return elogio;
    }

    public void setElogio(String elogio) {
        this.elogio = elogio;
    }

    public UsrCuenta getEmisor() {
        return emisor;
    }

    public void setEmisor(UsrCuenta emisor) {
        this.emisor = emisor;
    }

    public UsrCuenta getReceptor() {
        return receptor;
    }

    public void setReceptor(UsrCuenta receptor) {
        this.receptor = receptor;
    }
    
}
