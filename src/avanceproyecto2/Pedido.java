package avanceproyecto2;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private Usuario cliente;
    private List<Producto> productos;
    private double total;

    public Pedido(int id, Usuario cliente) {
        this.id = id;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.total = 0.0;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        total += producto.getPrecio();
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Pedido ID: " + id + ", Cliente: " + cliente.getNombreUsuario() + ", Total: " + total;
    }
}
