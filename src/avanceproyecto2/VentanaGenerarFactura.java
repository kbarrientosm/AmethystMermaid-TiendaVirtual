package avanceproyecto2;
import javax.swing.*;

public class VentanaGenerarFactura extends JFrame {
    public VentanaGenerarFactura() {
        setTitle("Generar Factura");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel lblFactura = new JLabel("Factura generada:");
        lblFactura.setBounds(20, 20, 150, 25);
        add(lblFactura);

        JTextArea txtFactura = new JTextArea();
        txtFactura.setBounds(20, 50, 350, 200);
        add(txtFactura);
    }
}
