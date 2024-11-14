package p147_TercerExamenParcial;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class App extends JFrame implements ActionListener {
    private ArrayList<Jugador> datos;
    private JMenuBar menuBar;
    private JMenu mnuArchivo, mnuAyuda;
    private JMenuItem smnAbrir, smnGuardar, smnSalir, smnAcercade;
    private JDialog jdlAcercade;
    private JLabel lblDatos;
    private JTable table;
    private JScrollPane spane;
    private DefaultTableModel modelo;
    private JPanel pnlTabla, pnlDatos, pnlBotones;
    private JLabel lblNombre, lblEdad, lblSexo, lblEstadoCivil, lblDescripcion, lblSalario;
    private JTextField txtNombre, txtEdad, txtSexo, txtEstadoCivil, txtDescripcion, txtSalario;
    private JButton btnAgregar, btnGrabar;
    private JFileChooser fchArchivo;

    public App() {
        super("Procesa datos de Jugadores");
        inicializarMenu();
        inicializarAcercaDe();
        inicializarComponentes();
        datos = new ArrayList<>();
    }

    private void inicializarMenu() {
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        mnuArchivo = new JMenu("Archivo");
        menuBar.add(mnuArchivo);

        mnuAyuda = new JMenu("Ayuda");
        menuBar.add(mnuAyuda);

        smnAbrir = crearMenuItem("Abrir", mnuArchivo);
        smnGuardar = crearMenuItem("Guardar", mnuArchivo);
        mnuArchivo.add(new JSeparator());
        smnSalir = crearMenuItem("Salir", mnuArchivo);
        smnAcercade = crearMenuItem("Acerca de ...", mnuAyuda);
    }

    private JMenuItem crearMenuItem(String texto, JMenu menu) {
        JMenuItem item = new JMenuItem(texto);
        menu.add(item);
        item.addActionListener(this);
        return item;
    }

    private void inicializarAcercaDe() {
        jdlAcercade = new JDialog(this, "Acerca de ...", true);
        jdlAcercade.setSize(400, 250);
        jdlAcercade.setLocationRelativeTo(this);
        lblDatos = new JLabel("<html>Programación Orientada a Objetos I<br>Sebastian Guerra Hernandez<br>sebas@uaz.edu.mx<br>Tercer Examen Parcial</html>", JLabel.CENTER);
        lblDatos.setFont(new Font("Arial", Font.BOLD, 18));
        jdlAcercade.add(lblDatos);
    }

    private void inicializarComponentes() {
        setLayout(new GridLayout(3, 1));

        inicializarTabla();
        inicializarPanelDatos();
        inicializarPanelBotones();
    }

    private void inicializarTabla() {
        pnlTabla = new JPanel(new BorderLayout());
        getContentPane().add(pnlTabla);

        modelo = new DefaultTableModel(new String[]{"Nombre", "Edad", "Sexo", "Estado Civil", "Descripcion", "Salario"}, 0);
        table = new JTable(modelo);
        table.getTableHeader().setBackground(Color.CYAN);

        spane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        pnlTabla.add(spane);

        table.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                mostrarDatos(table.rowAtPoint(e.getPoint()));
            }
        });
    }

    private void inicializarPanelDatos() {
        pnlDatos = new JPanel(new GridLayout(6, 2));
        getContentPane().add(pnlDatos);

        lblNombre = new JLabel("Nombre", SwingConstants.RIGHT);
        txtNombre = new JTextField();
        lblEdad = new JLabel("Edad", SwingConstants.RIGHT);
        txtEdad = new JTextField();
        lblSexo = new JLabel("Sexo", SwingConstants.RIGHT);
        txtSexo = new JTextField();
        lblEstadoCivil = new JLabel("Estado Civil", SwingConstants.RIGHT);
        txtEstadoCivil = new JTextField();
        lblDescripcion = new JLabel("Descripcion", SwingConstants.RIGHT);
        txtDescripcion = new JTextField();
        lblSalario = new JLabel("Salario", SwingConstants.RIGHT);
        txtSalario = new JTextField();

        agregarCampo(lblNombre, txtNombre);
        agregarCampo(lblEdad, txtEdad);
        agregarCampo(lblSexo, txtSexo);
        agregarCampo(lblEstadoCivil, txtEstadoCivil);
        agregarCampo(lblDescripcion, txtDescripcion);
        agregarCampo(lblSalario, txtSalario);
    }

    private void agregarCampo(JLabel label, JTextField field) {
        pnlDatos.add(label);
        pnlDatos.add(field);
    }

    private void inicializarPanelBotones() {
        pnlBotones = new JPanel();
        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        pnlBotones.add(btnAgregar);

        btnGrabar = new JButton("Grabar");
        btnGrabar.setEnabled(false);
        btnGrabar.addActionListener(this);
        pnlBotones.add(btnGrabar);

        add(pnlBotones);
    }

    private void mostrarDatos(int index) {
        Jugador jugador = datos.get(index);
        txtNombre.setText(jugador.getNombre());
        txtEdad.setText(String.valueOf(jugador.getEdad()));
        txtSexo.setText(String.valueOf(jugador.getSexo()));
        txtEstadoCivil.setText(jugador.getEstadocivil());
        txtDescripcion.setText(jugador.getDescripcion());
        txtSalario.setText(String.valueOf(jugador.getSalario()));
    }

    private void cargarDatos() {
        modelo.setRowCount(0);
        for (Jugador jugador : datos) {
            modelo.addRow(new Object[]{jugador.getNombre(), jugador.getEdad(), jugador.getSexo(), jugador.getEstadocivil(), jugador.getDescripcion(), jugador.getSalario()});
        }
    }

    private void activarCampos(boolean activar) {
        for (Component componente : pnlDatos.getComponents()) {
            if (componente instanceof JTextField) {
                componente.setEnabled(activar);
            }
        }
    }

    private void limpiarCampos() {
        for (Component componente : pnlDatos.getComponents()) {
            if (componente instanceof JTextField) {
                ((JTextField) componente).setText("");
            }
        }
    }

    private void guardarCampos() {
        Jugador jugador = new Jugador(
                txtNombre.getText(),
                Integer.parseInt(txtEdad.getText()),
                txtSexo.getText().charAt(0),
                txtEstadoCivil.getText(),
                txtDescripcion.getText(),
                Double.parseDouble(txtSalario.getText())
        );
        datos.add(jugador);
        cargarDatos();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == smnSalir) dispose();
        else if (source == smnAcercade) jdlAcercade.setVisible(true);
        else if (source == btnAgregar) {
            activarCampos(true);
            limpiarCampos();
            btnAgregar.setEnabled(false);
            btnGrabar.setEnabled(true);
        } else if (source == btnGrabar) {
            guardarCampos();
            limpiarCampos();
            activarCampos(false);
            btnGrabar.setEnabled(false);
            btnAgregar.setEnabled(true);
        } else if (source == smnGuardar) {
            guardarArchivo();
        } else if (source == smnAbrir) {
            abrirArchivo();
        }
    }

    private void guardarArchivo() {
        fchArchivo = new JFileChooser();
        fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos (.dat)", "dat"));
        if (fchArchivo.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File archivo = fchArchivo.getSelectedFile();
            try {
                Util.grabarDatos(archivo.getName(), datos);
                JOptionPane.showMessageDialog(this, "Datos guardados en: " + archivo.getName(), "Correcto", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void abrirArchivo() {
        fchArchivo = new JFileChooser();
        fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos (.dat)", "dat"));
        if (fchArchivo.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File archivo = fchArchivo.getSelectedFile();
            try {
                datos = Util.leerDatos(archivo.getName());
                cargarDatos();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.setSize(650, 450);
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.activarCampos(false);
    }
}
