package avanceproyecto2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    public VentanaPrincipal() {
        setTitle("Tienda AmethystMermaid");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JButton btnGestionProductos = new JButton("Gestión de Productos");
        btnGestionProductos.setBounds(50, 50, 300, 30);
        add(btnGestionProductos);

        JButton btnRealizarPedido = new JButton("Realizar Pedido");
        btnRealizarPedido.setBounds(50, 100, 300, 30);
        add(btnRealizarPedido);

        JButton btnGenerarFactura = new JButton("Generar Factura");
        btnGenerarFactura.setBounds(50, 150, 300, 30);
        add(btnGenerarFactura);

        JButton btnEstadisticas = new JButton("Estadísticas");
        btnEstadisticas.setBounds(50, 200, 300, 30);
        add(btnEstadisticas);

        btnGestionProductos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VentanaGestionProductos().setVisible(true);
            }
        });

        btnRealizarPedido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VentanaRealizarPedido().setVisible(true);
            }
        });

        btnGenerarFactura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VentanaGenerarFactura().setVisible(true);
            }
        });

        btnEstadisticas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VentanaEstadisticas().setVisible(true);
            }
        });
    }
}
