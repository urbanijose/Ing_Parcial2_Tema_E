package ing_parcial2_tema_e;
public class Viaje {
    private int id;
    private Pasajero pasajero;
    private Conductor conductor = null;
    private Ubicacion origen;
    private int duracion;
    private double monto;
    private String nombrePasajero;
    private Ubicacion destino;
    private String estado;
    private int horaPartida;

    public Viaje(int id, Pasajero pasajero, Ubicacion origen, int duracion, String nombrePasajero, Ubicacion destino, String estado, int horaPartida) {
        this.id = id;
        this.pasajero = pasajero;
        this.origen = origen;
        this.duracion = duracion;
        this.nombrePasajero = nombrePasajero;
        this.destino = destino;
        this.estado = estado;
        this.horaPartida = horaPartida;
        this.monto = calcularTarifa();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Ubicacion getOrigen() {
        return origen;
    }

    public void setOrigen(Ubicacion origen) {
        this.origen = origen;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getNombrePasajero() {
        return nombrePasajero;
    }

    public void setNombrePasajero(String nombrePasajero) {
        this.nombrePasajero = nombrePasajero;
    }

    public Ubicacion getDestino() {
        return destino;
    }

    public void setDestino(Ubicacion destino) {
        this.destino = destino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void asignarConductor(Conductor conductor) {
        this.conductor = conductor;
        this.estado = "confirmado";
    }
    
    public void concluirViaje() {
        this.estado = "concluido";
        if (this.conductor != null) {
            this.conductor.getBilletera().deposito(monto);
        }
    }
    public double calcularTarifa(){
        double tarifaBase = 200.0;
        double tarifaDistancia = 75.0;
        double tarifaTiempo = 50.0;
        double distancia = origen.calcularDistancia(destino);
        double tiempoEstimado = distancia * 1.5;
        double cargoDemanda = 0.0;
        if (horaPartida >= 7 && horaPartida < 13) {
            cargoDemanda = 900.0;
        } else if (horaPartida >= 13 && horaPartida < 19) {
            cargoDemanda = 1300.0;
        } else if (horaPartida >= 19 || horaPartida < 1) {
            cargoDemanda = 700.0;
        } else if (horaPartida >= 1 && horaPartida < 7){
            cargoDemanda = 1250.0;
        }
        return tarifaBase + (tarifaDistancia * distancia) + (tarifaTiempo * tiempoEstimado);
    }
}
