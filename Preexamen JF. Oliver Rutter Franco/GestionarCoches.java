import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class GestionarCoches extends JFrame{

    private ArrayList<Coche> listaCoches = new ArrayList<>();

    private JTextField txtMarca;
    private JTextField txtAnio;
    private JTextField txtColor;

    private JTable tabla;
    private DefaultTableModel modeloTabla;

    private CardLayout cardLayout;
    private JPanel panelPrincipal;

    public GestionarCoches() {

        setTitle("Gestión de Coches");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelMenu = new JPanel();

        JButton btnAgregar = new JButton("Agregar botón");
        JButton btnMostrar = new JButton("Mostrar botón");

        panelMenu.add(btnAgregar);
        panelMenu.add(btnMostrar);

        cardLayout = new CardLayout();
        panelPrincipal = new JPanel(cardLayout);

        JPanel panelFomulario = crearFormulario();
        JPanel panelTabla = crearTabla();

        panelPrincipal.add(panelFomulario, "Formulario");
        panelPrincipal.add(panelTabla, "Tabla");

        btnAgregar.addActionListener(e ->
                cardLayout.show(panelPrincipal, "Formulario"));

        btnMostrar.addActionListener(e -> {
            actualizarTabla();
            cardLayout.show(panelPrincipal, "Tabla");
        });

        add(panelMenu, BorderLayout.NORTH);
        add(panelPrincipal, BorderLayout.CENTER);
    }

    public JPanel crearFormulario() {

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));

        JLabel lblMarca = new JLabel("Marca: ");
        JLabel lblAnio = new JLabel("Año: ");
        JLabel lblColor = new JLabel("Color: ");

        txtMarca = new JTextField();
        txtAnio = new JTextField();
        txtColor = new JTextField();

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

        JButton btnGuardar = new JButton("Guardar coche");

        btnGuardar.addActionListener(e -> guardarCoche());

        panel.add(lblMarca);
        panel.add(txtMarca);

        panel.add(lblAnio);
        panel.add(txtAnio);

        panel.add(lblColor);
        panel.add(txtColor);

        panel.add(new JLabel());
        panel.add(btnGuardar);

        return panel;
    }

    public JPanel crearTabla() {

        JPanel panel = new JPanel();

        modeloTabla = new DefaultTableModel();

        modeloTabla.addColumn("Marca");
        modeloTabla.addColumn("Año");
        modeloTabla.addColumn("Color");

        tabla = new JTable(modeloTabla);

        JScrollPane scrollPane = new JScrollPane(tabla);
        panel.add(scrollPane, BorderLayout.CENTER);

        return panel;
    }

    public void guardarCoche() {

        String marca = txtMarca.getText().trim();
        String anioTexto = txtAnio.getText().trim();
        String color = txtColor.getText().trim();

        if (marca.isEmpty() || anioTexto.isEmpty() ||color.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "No se permiten campos vacíos"
            );
            return;
        }

        int anio = Integer.parseInt(anioTexto);

        Coche coches = new Coche(marca, anio, color);

        listaCoches.add(coches);

        JOptionPane.showMessageDialog(
                this,
                "Coche guardado correctamente"
        );

        txtMarca.setText("");
        txtAnio.setText("");
        txtColor.setText("");
    }

    public void actualizarTabla() {

        modeloTabla.setRowCount(0);

        for (Coche coches : listaCoches) {

                modeloTabla.addRow(new Object[]{
                        coches.getMarca(),
                        coches.getAnio(),
                        coches.getColor()
                });
        }


    }






}
