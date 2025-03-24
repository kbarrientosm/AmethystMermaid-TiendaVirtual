package avanceproyecto2;
public class Curso extends Producto {
    private String instructor;

    public Curso(int id, String nombre, String descripcion, double precio, int cantidad, String categoria, String instructor) {
        super(id, nombre, descripcion, precio, cantidad, categoria);
        this.instructor = instructor;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Instructor: " + instructor;
    }
}
