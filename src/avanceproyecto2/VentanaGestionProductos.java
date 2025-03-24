package avanceproyecto2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaGestionProductos extends JFrame {
    private JTextField txtNombre, txtDescripcion, txtPrecio, txtCantidad, txtCategoria;
    private JButton btnAgregar, btnModificar, btnEliminar;

    public VentanaGestionProductos() {
        setTitle("Gestión de Productos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 20, 80, 25);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(100, 20, 150, 25);
        add(txtNombre);

        JLabel lblDescripcion = new JLabel("Descripción:");
        lblDescripcion.setBounds(20, 60, 80, 25);
        add(lblDescripcion);

        txtDescripcion = new JTextField();
        txtDescripcion.setBounds(100, 60, 150, 25);
        add(txtDescripcion);

        JLabel lblPrecio = new JLabel("Precio:");
        lblPrecio.setBounds(20, 100, 80, 25);
        add(lblPrecio);

        txtPrecio = new JTextField();
        txtPrecio.setBounds(100, 100, 150, 25);
        add(txtPrecio);

        JLabel lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setBounds(20, 140, 80, 25);
        add(lblCantidad);

        txtCantidad = new JTextField();
        txtCantidad.setBounds(100, 140, 150, 25);
        add(txtCantidad);

        JLabel lblCategoria = new JLabel("Categoría:");
        lblCategoria.setBounds(20, 180, 80, 25);
        add(lblCategoria);

        txtCategoria = new JTextField();
        txtCategoria.setBounds(100, 180, 150, 25);
        add(txtCategoria);

        btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(20, 220, 100, 25);
        add(btnAgregar);

        btnModificar = new JButton("Modificar");
        btnModificar.setBounds(130, 220, 100, 25);
        add(btnModificar);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(240, 220, 100, 25);
        add(btnEliminar);

        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para agregar producto
            }
        });

        btnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para modificar producto
            }
        });

        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para eliminar producto
            }
        });
    }
}
