package avanceproyecto2;
public class Aromaterapia extends Producto {
    private String aroma;

    public Aromaterapia(int id, String nombre, String descripcion, double precio, int cantidad, String categoria, String aroma) {
        super(id, nombre, descripcion, precio, cantidad, categoria);
        this.aroma = aroma;
    }

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    @Override
    public String toString() {
        return super.toString() + ", Aroma: " + aroma;
    }
}
