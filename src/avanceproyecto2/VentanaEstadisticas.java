package avanceproyecto2;
import javax.swing.*;

public class VentanaEstadisticas extends JFrame {
    public VentanaEstadisticas() {
        setTitle("Estadísticas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel lblEstadisticas = new JLabel("Estadísticas de ventas:");
        lblEstadisticas.setBounds(20, 20, 150, 25);
        add(lblEstadisticas);

        JTextArea txtEstadisticas = new JTextArea();
        txtEstadisticas.setBounds(20, 50, 350, 200);
        add(txtEstadisticas);
    }
}
