package avanceproyecto2;
public class Factura {
    private Pedido pedido;

    public Factura(Pedido pedido) {
        this.pedido = pedido;
    }

    public String generarFactura() {
        return "Factura:\n" + pedido.toString();
    }
}
