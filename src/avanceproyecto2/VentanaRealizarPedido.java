package avanceproyecto2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaRealizarPedido extends JFrame {
    private JComboBox<Producto> comboProductos;
    private JButton btnAgregar, btnFinalizar;

    public VentanaRealizarPedido() {
        setTitle("Realizar Pedido");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        comboProductos = new JComboBox<>();
        comboProductos.setBounds(20, 20, 200, 25);
        add(comboProductos);

        btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(20, 60, 100, 25);
        add(btnAgregar);

        btnFinalizar = new JButton("Finalizar");
        btnFinalizar.setBounds(130, 60, 100, 25);
        add(btnFinalizar);

        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para agregar producto al pedido
            }
        });

        btnFinalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para finalizar pedido
            }
        });
    }
}
