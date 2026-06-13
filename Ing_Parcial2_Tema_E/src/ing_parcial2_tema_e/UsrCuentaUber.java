package ing_parcial2_tema_e;
import java.util.ArrayList;

public class UsrCuentaUber {
    private String nombre;
    private String email;
    private long telefono;
    private String password;
    private int codCuenta;
    private ArrayList<Calificacion> calificaciones;
    private double promedioCalificacion;
    protected Ubicacion ubicacion;

    public UsrCuentaUber(String nombre, String email, long telefono, String password, int codCuenta, Ubicacion ubicacion) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.password = password;
        this.codCuenta = codCuenta;
        this.promedioCalificacion = 5.0;
        this.ubicacion = ubicacion;
        this.calificaciones = new ArrayList<>();
    }

    public UsrCuentaUber() {
        this.promedioCalificacion= 5.0;
        this.calificaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCodCuenta() {
        return codCuenta;
    }

    public void setCodCuenta(int codCuenta) {
        this.codCuenta = codCuenta;
    }

    public double getPromedioCalificacion() {
        return promedioCalificacion;
    }

    public void setPromedioCalificacion(double promedioCalificacion) {
        this.promedioCalificacion = promedioCalificacion;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }
    
    
    
    public void consultarCalificaciones() {
        System.out.println("Ultimas calificaciones");
        ArrayList<Calificacion> ultimas10Calificaciones = new ArrayList<>();
        if (calificaciones.size() > 10) {
            for (int i = 0; i < 10; i++) {
                ultimas10Calificaciones.add(calificaciones.get(i)); 
            }
        } else if (calificaciones.size() >= 1 && calificaciones.size() <= 10) {
            for (int i = 0; i < calificaciones.size(); i++) {
                ultimas10Calificaciones.add(calificaciones.get(i));
            }
        } else {
            System.out.println("No hay calificaciones para mostrar");
        }
        System.out.println("Estas son tus ultimas 10 calificaciones: ");
        System.out.println(ultimas10Calificaciones);
    }
    
    public void calificar(UsrCuentaUber objetivo, Calificacion calif){
        ArrayList<Calificacion> calificacionesObjetivo = objetivo.getCalificaciones();
        if (calificacionesObjetivo.size() >= 500) {
            calificacionesObjetivo.remove(0);
        }
        calificacionesObjetivo.add(calif);
        
        objetivo.promedioCalificaciones();
    }
    
    public void promedioCalificaciones() {
        if (calificaciones.isEmpty()) {
            this.promedioCalificacion = 5.0;
            return;
        }
        double suma = 0;
        for (Calificacion aux : calificaciones) {
            suma = suma + aux.getPuntaje();
        }
        this.promedioCalificacion = suma / calificaciones.size();
    }
}
