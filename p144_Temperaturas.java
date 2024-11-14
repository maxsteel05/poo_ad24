import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class p144_Temperaturas extends JFrame implements ActionListener, ChangeListener {
    JPanel p1;
    JLabel lblCentigrados, lblFahrenheit;
    JTextField txtCentigrados,txtFahrenheit;
    ButtonGroup grpOpciones;
    JRadioButton rbtCentigrados, rbtFahrenheit;
    JButton btnCalcular, btnSalir;

    public p144_Temperaturas() {
        super("Calculadora Temperaturas");
        setLayout(new FlowLayout());

        p1 = new JPanel();
        p1.setLayout(new GridLayout(5, 2)); 

        lblCentigrados = new JLabel("Centigrados: ", JLabel.RIGHT); p1.add(lblCentigrados);
        txtCentigrados = new JTextField(); p1.add(txtCentigrados);
        lblFahrenheit = new JLabel("Fahrenheit: ", JLabel.RIGHT); p1.add(lblFahrenheit);
        txtFahrenheit = new JTextField(); p1.add(txtFahrenheit);

        grpOpciones = new ButtonGroup();
        rbtCentigrados = new JRadioButton(" Calcular Centigrados");
        rbtFahrenheit = new JRadioButton("Calcular Fahrenheit");
        grpOpciones.add(rbtCentigrados); grpOpciones.add(rbtFahrenheit);
        p1.add(rbtCentigrados); p1.add(rbtFahrenheit);
        add(p1);

        btnCalcular = new JButton("Aceptar"); add(btnCalcular);
        btnSalir = new JButton("Salir"); add(btnSalir);

        rbtCentigrados.addChangeListener(this);
        rbtFahrenheit.addChangeListener(this);

        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);
    }

    public void stateChanged(ChangeEvent e) {
        txtCentigrados.setEnabled(true);
        txtFahrenheit.setEnabled(true);
        if (rbtCentigrados.isSelected())
            txtCentigrados.setEnabled(false);
        else if (rbtFahrenheit.isSelected())
            txtFahrenheit.setEnabled(false);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            try {
                if (rbtCentigrados.isSelected()) {
                    float f = Float.parseFloat(txtFahrenheit.getText());
                    float c = (f - 32) * 5 / 9;
                    txtCentigrados.setText(String.format("%.2f", c));
                } else if (rbtFahrenheit.isSelected()) {
                    float c = Float.parseFloat(txtCentigrados.getText());
                    float f = (c * 9 / 5) + 32;
                    txtFahrenheit.setText(String.format("%.2f", f));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Por favor introduce valores numéricos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnSalir) {
            dispose();
        }
    }
    public static void main(String[] args) {
        p144_Temperaturas app = new p144_Temperaturas();
        app.setBounds(10, 10, 300, 200);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
