package avanceproyecto2;
import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private Inventario inventario;
    private List<Pedido> pedidos;

    public Tienda() {
        this.inventario = new Inventario();
        this.pedidos = new ArrayList<>();
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}
