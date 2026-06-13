package ing_parcial2_tema_e;
public class Ubicacion {
    private int x;
    private int y;

    public Ubicacion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public double calcularDistancia(Ubicacion destino) {
        double dx = destino.getX() - this.x;
        double dy = destino.getY() - this.y;
        return Math.hypot(dx, dy);
    }
}
