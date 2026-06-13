package ing_parcial2_tema_e;
public class Conductor extends UsrCuentaUber {
    private int nro;
    private boolean licencia;
    private Billetera billetera;
    private Vehiculo vehiculo;
    private boolean disponible;
    private boolean activo;
    private int cantViajes = 0;
    private int viajesMadrugada = 0;

    public Conductor(int nro, boolean licencia, Vehiculo vehiculo, boolean disponible, boolean activo, String nombre, String email, long telefono, String password, int codCuenta, Ubicacion ubicacion) {
        super(nombre, email, telefono, password, codCuenta, ubicacion);
        this.nro = nro;
        this.licencia = licencia;
        this.billetera = new Billetera();
        this.vehiculo = vehiculo;
        this.disponible = disponible;
        this.activo = activo;
    }

    public Conductor() {
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public boolean isLicencia() {
        return licencia;
    }

    public void setLicencia(boolean licencia) {
        this.licencia = licencia;
    }

    public Billetera getBilletera() {
        return billetera;
    }

    public void setBilletera(Billetera billetera) {
        this.billetera = billetera;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getCantViajes() {
        return cantViajes;
    }

    public void setCantViajes(int cantViajes) {
        this.cantViajes = cantViajes;
    }

    public int getViajesMadrugada() {
        return viajesMadrugada;
    }
    
    public void aceptarViaje(Viaje viaje) {
        viaje.asignarConductor(this);
    }
    
    public void setViajesMadrugada(int viajesMadrugada) {
        this.viajesMadrugada = viajesMadrugada;
    }
    
    public void registarFinViaje(int horaPartida) {
        if (horaPartida >= 4 && horaPartida < 8) {
            this.viajesMadrugada++;
        } else {
            this.cantViajes++;
        }
        evaluarBonos();
    }
    
    public void evaluarBonos() {
        if (this.cantViajes == 8) {
            this.billetera.deposito(8000);
        } else if (cantViajes == 17) {
            this.billetera.deposito(20000);
        } else if (cantViajes == 24) {
            this.billetera.deposito(40000);
        }
        
        if (this.viajesMadrugada == 4) {
            this.billetera.deposito(8000);
            this.viajesMadrugada = 0;
        }
    }
}
