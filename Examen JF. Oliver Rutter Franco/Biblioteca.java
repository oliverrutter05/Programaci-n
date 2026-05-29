import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Biblioteca extends JFrame {

    private ArrayList<Libro> listaLibros = new ArrayList<>();

    private JTextField txtTitulo;
    private JTextField txtAutor;
    private JTextField txtAnio;

    private JTable tabla;
    private DefaultTableModel modeloTabla;

    private CardLayout cardLayout;
    private JPanel panelPrincipal;

    public Biblioteca() {

        setTitle("Gestión de Libros");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelMenu = new JPanel();

        JButton btnAgregar = new JButton("Agregar libro");
        JButton btnMostrar = new JButton("Mostrar libros");

        cardLayout = new CardLayout();
        panelPrincipal = new JPanel(cardLayout);

        JPanel panelFormulario = crearFormulario();
        JPanel panelTabla = crearTabla();


        btnAgregar.addActionListener(e ->
                cardLayout.show(panelPrincipal, "Formulario"));

        btnMostrar.addActionListener(e -> {
            actualizarTabla();
            cardLayout.show(panelPrincipal, "Tabla");
        });


        add(panelMenu,"Formulario");
        add(panelPrincipal,"Tabla");

    }

    public JPanel crearFormulario() {

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));

        JLabel lblTitulo = new JLabel("Título: ");
        JLabel lblAutor = new JLabel("Autor: ");
        JLabel lblAnio = new JLabel("Año de publicaión: ");

        txtTitulo = new JTextField();
        txtAutor = new JTextField();
        txtAnio = new JTextField();

        txtAnio.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();

                if (!Character.isDigit(c)) {
                    e.consume();
                }
                return;
            }
        });

        JButton btnGuardar = new JButton("Guardar libro");
        btnGuardar.addActionListener(e -> guardarLibro());

        panel.add(lblTitulo);
        panel.add(txtTitulo);

        panel.add(lblAutor);
        panel.add(txtAutor);

        panel.add(lblAnio);
        panel.add(txtAnio);

        panel.add(new JLabel());
        panel.add(btnGuardar);

        return panel;
    }

    public JPanel crearTabla() {

        JPanel panel = new JPanel();

        modeloTabla = new DefaultTableModel();

        modeloTabla.addColumn("TITULO");
        modeloTabla.addColumn("AUTOR");
        modeloTabla.addColumn("AÑO DE PUBLICACIÓN");

        tabla = new JTable(modeloTabla);

        JScrollPane scrollPane = new JScrollPane(tabla);
        panel.add(scrollPane, BorderLayout.CENTER);

        return panel;
    }

    public void guardarLibro() {

        String titulo = txtTitulo.getText().trim();
        String autor = txtAutor.getText().trim();
        String anioTexto = txtAnio.getText().trim();

        if (titulo.isEmpty() || autor.isEmpty() || anioTexto.isEmpty()) {
            JOptionPane.showConfirmDialog(
                    this,
                    "No se permiten campos vacíos"
            );
            return;
        }

        int anio = Integer.parseInt(anioTexto);

        Libro libros = new Libro(titulo, autor, anio);
        listaLibros.add(libros);

        JOptionPane.showConfirmDialog(
                this,
                "Libro guardado correctamente"
        );

        txtTitulo.setText("");
        txtAutor.setText("");
        txtAnio.setText("");
    }

    public void actualizarTabla() {

        modeloTabla.setRowCount(0);

        for (Libro libros : listaLibros) {
            modeloTabla.addRow(new Object[]{
                    libros.getTitulo(),
                    libros.getAutor(),
                    libros.getAnio_publicacion()
            });
        }
    }
}
