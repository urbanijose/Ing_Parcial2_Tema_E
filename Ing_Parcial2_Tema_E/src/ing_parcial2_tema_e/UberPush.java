package ing_parcial2_tema_e;

import java.util.ArrayList;

public class UberPush {
    private int nro;

    public UberPush(int nro) {
        this.nro = nro;
    }

    public UberPush() {
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }
    
    public void calcularCercania(Ubicacion origen, ArrayList<Conductor> conductores, Viaje viaje) {
        ArrayList <Conductor> conductoresCercanos = new ArrayList<>();
        for (Conductor aux : conductores) {
            if (aux.isDisponible()) {
                double dist = origen.calcularDistancia(aux.getUbicacion());
                if (dist <= 1000.0) {
                    conductoresCercanos.add(aux);
                }
            }
        }
        notificarConductores(conductoresCercanos, viaje);
    }
    
    public void notificarConductores(ArrayList<Conductor> conductores, Viaje viaje) {
        System.out.println("Viaje cerca: " + viaje);
    }
}
