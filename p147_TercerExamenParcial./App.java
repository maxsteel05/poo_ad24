package p147_TercerExamenParcial;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.io.File;
import java.awt.*;

public class App extends JFrame implements ActionListener {
    ArrayList<Jugador> datos;
    JMenuBar menuBar;
    JMenu mnuArchivo, mnuAyuda;
    JMenuItem smnAbrir, smnGuardar, smnSalir, smnAcercade;
    JDialog jdlAcercade;
    JLabel lblDatos;
    JTable table;
    JScrollPane spane;
    DefaultTableModel modelo;
    JPanel pnlTabla, pnlDatos, pnlBotones;
    JLabel lblNombre, lblEdad, lblSexo, lblEstadoCivil, lblDescripcion, lblSalario;
    JTextField txtNombre, txtEdad, txtSexo, txtEstadoCivil, txtDescripcion, txtSalario;
    JButton btnAgregar, btnGrabar;
    JFileChooser fchArchivo;

    public App() {
        super("Control de Jugadores de Fútbol");

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        mnuArchivo = new JMenu("Archivo");
        menuBar.add(mnuArchivo);
        mnuAyuda = new JMenu("Ayuda");
        menuBar.add(mnuAyuda);
        
        smnAbrir = new JMenuItem("Abrir");
        mnuArchivo.add(smnAbrir);
        smnAbrir.addActionListener(this);
        
        smnGuardar = new JMenuItem("Guardar");
        mnuArchivo.add(smnGuardar);
        smnGuardar.addActionListener(this);
        
        mnuArchivo.add(new JSeparator());
        
        smnSalir = new JMenuItem("Salir");
        mnuArchivo.add(smnSalir);
        smnSalir.addActionListener(this);
        
        smnAcercade = new JMenuItem("Acerca de ...");
        mnuAyuda.add(smnAcercade);
        smnAcercade.addActionListener(this);

        jdlAcercade = new JDialog(this, "Acerca de ...");
        jdlAcercade.setSize(400, 250);
        jdlAcercade.setModal(true);
        jdlAcercade.setLocationRelativeTo(null);
        lblDatos = new JLabel("<html>Programación Orientada a Objetos I<br>Nombre del Profesor<br>correo@uaz.edu.mx</html>", JLabel.CENTER);
        jdlAcercade.add(lblDatos);

        setLayout(new GridLayout(3, 1));
        pnlTabla = new JPanel();
        pnlTabla.setLayout(new BoxLayout(pnlTabla, BoxLayout.X_AXIS));
        getContentPane().add(pnlTabla);

        spane = new JScrollPane();
        spane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        pnlTabla.add(spane);
        table = new JTable();
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Nombre", "Edad", "Sexo", "Estado Civil", "Descripción", "Salario"});
        table.setModel(modelo);
        spane.setViewportView(table);

        pnlDatos = new JPanel();
        pnlDatos.setLayout(new GridLayout(6, 2, 5, 5));
        getContentPane().add(pnlDatos);
        
        lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField();
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);

        lblEdad = new JLabel("Edad:");
        txtEdad = new JTextField();
        pnlDatos.add(lblEdad);
        pnlDatos.add(txtEdad);

        lblSexo = new JLabel("Sexo:");
        txtSexo = new JTextField();
        pnlDatos.add(lblSexo);
        pnlDatos.add(txtSexo);

        lblEstadoCivil = new JLabel("Estado Civil:");
        txtEstadoCivil = new JTextField();
        pnlDatos.add(lblEstadoCivil);
        pnlDatos.add(txtEstadoCivil);

        lblDescripcion = new JLabel("Descripción:");
        txtDescripcion = new JTextField();
        pnlDatos.add(lblDescripcion);
        pnlDatos.add(txtDescripcion);

        lblSalario = new JLabel("Salario:");
        txtSalario = new JTextField();
        pnlDatos.add(lblSalario);
        pnlDatos.add(txtSalario);

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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == smnSalir) dispose();
        else if(e.getSource() == smnAcercade) jdlAcercade.setVisible(true);
        else if(e.getSource() == btnAgregar) {
            
            activarCampos(true);
            limpiarCampos();
            txtNombre.requestFocus();
            btnAgregar.setEnabled(false);
            btnGrabar.setEnabled(true);
        } else if(e.getSource() == btnGrabar) {
            guardarCampos();
            limpiarCampos();
            activarCampos(false);
            btnGrabar.setEnabled(false);
            btnAgregar.setEnabled(true);
        }
    }

    public void guardarCampos() {
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

    public void cargarDatos() {
        DefaultTableModel dm = (DefaultTableModel)table.getModel();
        while(dm.getRowCount() > 0) dm.removeRow(0);
        for (Jugador jugador : datos) {
            modelo.addRow(new Object[]{jugador.getNombre(), jugador.getEdad(), jugador.getSexo(), 
                                       jugador.getEstadoCivil(), jugador.getDescripcion(), jugador.getSalario()});
        }
    }

    public void limpiarCampos() {
        txtNombre.setText("");
        txtEdad.setText("");
        txtSexo.setText("");
        txtEstadoCivil.setText("");
        txtDescripcion.setText("");
        txtSalario.setText("");
    }

    public void activarCampos(boolean activar) {
        txtNombre.setEnabled(activar);
        txtEdad.setEnabled(activar);
        txtSexo.setEnabled(activar);
        txtEstadoCivil.setEnabled(activar);
        txtDescripcion.setEnabled(activar);
        txtSalario.setEnabled(activar);
    }

    public static void main(String[] args) {
        App app = new App();
        app.setBounds(0, 0, 600, 400);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.datos = new ArrayList<>();
        app.activarCampos(false);
    }
}
