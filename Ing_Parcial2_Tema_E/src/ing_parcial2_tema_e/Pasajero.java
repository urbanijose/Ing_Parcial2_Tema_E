package ing_parcial2_tema_e;

import java.util.ArrayList;

public class Pasajero extends UsrCuentaUber {
    private ArrayList<TarjetaCredito> tarjetas;

    public Pasajero(ArrayList<TarjetaCredito> tarjetas, String nombre, String email, long telefono, String password, int codCuenta, Ubicacion ubicacion) {
        super(nombre, email, telefono, password, codCuenta, ubicacion);
        this.tarjetas = tarjetas;
    }

    public Pasajero() {
    }

    public ArrayList<TarjetaCredito> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(ArrayList<TarjetaCredito> tarjetas) {
        this.tarjetas = tarjetas;
    }
    
    public void registrarTarjeta(TarjetaCredito tarjeta) {
        tarjetas.add(tarjeta);
    }
    
    public void iniciarViaje(int duracion, String nombrePasajero, Ubicacion destino, int horaPartida) {
        Viaje v = new Viaje(1, this , ubicacion, duracion, nombrePasajero,destino, "pendiente", horaPartida);
    }
    
    public void concluirViaje(Viaje viaje){
        viaje.setEstado("cancelado");
    }
}
