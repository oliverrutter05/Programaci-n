import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    public Estudiante(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCurso() {
        return curso;
    }
}

public class GestionEstudiantes extends JFrame {

    private ArrayList<Estudiante> listaEstudiantes;
    private JTable tabla;
    private DefaultTableModel modelo;

    // Campos de texto
    private JTextField txtNombre;
    private JTextField txtEdad;
    private JTextField txtCurso;

    public GestionEstudiantes() {

        setTitle("Gestión de Estudiantes");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        listaEstudiantes = new ArrayList<>();

        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Curso");

        tabla = new JTable(modelo);

        tabla.setFont(new Font("Arial", Font.PLAIN, 14));
        tabla.setRowHeight(25);
        tabla.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));

        JScrollPane scrollPane = new JScrollPane(tabla);

        JPanel panelEntrada = new JPanel(new GridLayout(2, 4, 10, 10));

        txtNombre = new JTextField();
        txtEdad = new JTextField();
        txtCurso = new JTextField();

        JButton btnAgregar = new JButton("Agregar Estudiante");

        panelEntrada.add(new JLabel("Nombre:"));
        panelEntrada.add(new JLabel("Edad:"));
        panelEntrada.add(new JLabel("Curso:"));
        panelEntrada.add(new JLabel(""));

        panelEntrada.add(txtNombre);
        panelEntrada.add(txtEdad);
        panelEntrada.add(txtCurso);
        panelEntrada.add(btnAgregar);

        btnAgregar.addActionListener((ActionEvent e) -> agregarEstudiante());

        agregarDatosIniciales();

        setLayout(new BorderLayout(10, 10));
        add(panelEntrada, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void agregarEstudiante() {
        try {
            String nombre = txtNombre.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            String curso = txtCurso.getText();

            Estudiante estudiante = new Estudiante(nombre, edad, curso);

            listaEstudiantes.add(estudiante);

            modelo.addRow(new Object[]{
                    estudiante.getNombre(),
                    estudiante.getEdad(),
                    estudiante.getCurso()
            });

            txtNombre.setText("");
            txtEdad.setText("");
            txtCurso.setText("");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "La edad debe ser un número",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void agregarDatosIniciales() {
        listaEstudiantes.add(new Estudiante("Ana", 20, "Programación"));
        listaEstudiantes.add(new Estudiante("Carlos", 22, "Bases de Datos"));
        listaEstudiantes.add(new Estudiante("Lucía", 19, "Diseño Web"));

        for (Estudiante e : listaEstudiantes) {
            modelo.addRow(new Object[]{
                    e.getNombre(),
                    e.getEdad(),
                    e.getCurso()
            });
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GestionEstudiantes().setVisible(true);
        });
    }
}