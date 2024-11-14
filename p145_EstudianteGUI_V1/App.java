package p145_EstudianteGUI_V1;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.awt.*;

public class App extends JFrame implements ActionListener {
    ArrayList <Estudiante> datos;
    JMenuBar menuBar;
    JMenu mnuArchivo, mnuAyuda;
    JMenuItem smnAbrir, smnGuardar, smnSalir, smnAcercade;
    JDialog jdlAcercade;
    JLabel lblDatos;
    JTable table;
    JScrollPane spane;
    DefaultTableModel modelo;
    JPanel pnlTabla, pnlDatos;
    JLabel lblNombre, lblEdad, lblPeso, lblCorreo;
    JTextField txtNombre, txtEdad, txtPeso, txtCorreo;
    
    public App() {
        super("Procesa datos de estudiantes");
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
        lblDatos = new JLabel("<html>Programación Orientada a Objetos I<br>Sebastian Guerra Hernandez<br>sebas@uaz.edu.mx</html>",JLabel.CENTER);
        lblDatos.setFont(new Font("Arial",Font.BOLD, 18));
        jdlAcercade.add(lblDatos);



        setLayout(new GridLayout(2, 1, 0, 0)); //2 rengloes una columna
        pnlTabla = new JPanel();
        getContentPane().add(pnlTabla);
        spane = new JScrollPane();
        pnlTabla.add(spane);
        table = new JTable();
        table.getTableHeader().setBackground(Color.yellow);
        table.getTableHeader().setForeground(Color.black);
        spane.setViewportView(table);
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Nombre","Edad","Peso","Correo"});
        table.setModel(modelo);

        pnlDatos = new JPanel();
        getContentPane().add(pnlDatos);
        pnlDatos.setLayout(new GridLayout(4, 2, 0, 0));
        lblNombre = new JLabel("Nombre");
        lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNombre = new JTextField();
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        lblEdad = new JLabel("Edad");
        lblEdad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad = new JTextField();
        pnlDatos.add(lblEdad);
        pnlDatos.add(txtEdad);
        lblPeso = new JLabel("Peso");
        lblPeso.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPeso = new JTextField();
        pnlDatos.add(lblPeso);
        pnlDatos.add(txtPeso);
        lblCorreo = new JLabel("Correo:");
        lblCorreo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCorreo = new JTextField();
        pnlDatos.add(lblCorreo);
        pnlDatos.add(txtCorreo);
    }


    public void cargarDatos() {
        Object[] obj = new Object[4];
        for(int i=0; i<datos.size() ; i++) {
        obj[0] = datos.get(i).getNombre();
        obj[1] = datos.get(i).getEdad();
        obj[2] = datos.get(i).getPeso();
        obj[3] = datos.get(i).getCorreo();
        modelo.addRow(obj);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == smnSalir) dispose();
        else if(e.getSource() == smnAcercade) jdlAcercade.setVisible(true);
    }


    public static void main(String[] args) {
        App app = new App();
        app.setBounds(0,0,550,400);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.datos = Util.inicializarDatos();
        app.cargarDatos();
    }
}
