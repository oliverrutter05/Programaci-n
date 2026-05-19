import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroEstudiante extends JFrame {

    private JTextField txtNombre;
    private JTextField txtEdad;
    private JTextField txtCurso;
    private JButton btnGuardar;

    public RegistroEstudiante() {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        setTitle("Registro de Estudiante");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 5, 5));

        JLabel lblNombre = new JLabel("Nombre:");
        JLabel lblEdad = new JLabel("Edad:");
        JLabel lblCurso = new JLabel("Curso:");

        txtNombre = new JTextField();
        txtEdad = new JTextField();
        txtCurso = new JTextField();

        btnGuardar = new JButton("Guardar");

        panel.add(lblNombre);
        panel.add(txtNombre);

        panel.add(lblEdad);
        panel.add(txtEdad);

        panel.add(lblCurso);
        panel.add(txtCurso);

        panel.add(new JLabel());
        panel.add(btnGuardar);

        add(panel);

        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarDatos();
            }
        });
    }

    private void guardarDatos() {
        String nombre = txtNombre.getText();
        String edad = txtEdad.getText();
        String curso = txtCurso.getText();

        String mensaje = "Datos del estudiante:\n"
                + "Nombre: " + nombre + "\n"
                + "Edad: " + edad + "\n"
                + "Curso: " + curso;

        JOptionPane.showMessageDialog(this, mensaje);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RegistroEstudiante().setVisible(true);
        });
    }
}