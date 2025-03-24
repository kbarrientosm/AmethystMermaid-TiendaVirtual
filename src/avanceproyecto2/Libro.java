package avanceproyecto2;
public class Libro extends Producto {
    private String autor;

    public Libro(int id, String nombre, String descripcion, double precio, int cantidad, String categoria, String autor) {
        super(id, nombre, descripcion, precio, cantidad, categoria);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Autor: " + autor;
    }
}
