package avanceproyecto2;
public class Joyeria extends Producto {
    private String material;

    public Joyeria(int id, String nombre, String descripcion, double precio, int cantidad, String categoria, String material) {
        super(id, nombre, descripcion, precio, cantidad, categoria);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() + ", Material: " + material;
    }
}
