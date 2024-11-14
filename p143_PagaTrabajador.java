import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class p143_PagaTrabajador extends JFrame implements ActionListener {
    private JLabel lblHorasWorked, lblPagaPorHora, lblImpuesto;
    private JTextField txtHorasWorked, txtPagaPorHora, txtImpuesto;
    private JButton btnCalcular, btnSalir;
    private JLabel lblPagaPorHoraResultado, lblPagaBrutaResultado, lblImpuestoResultado, lblPagaNetaResultado;

    public p143_PagaTrabajador() {
        super("Calculadora Paga de Trabajador");
        setLayout(null);

        lblHorasWorked = new JLabel("Horas trabajadas:");
        lblHorasWorked.setBounds(10, 20, 100, 30);
        add(lblHorasWorked);

        txtHorasWorked = new JTextField();
        txtHorasWorked.setBounds(140, 20, 150, 30);
        add(txtHorasWorked);

        lblPagaPorHora = new JLabel("Paga por hora:");
        lblPagaPorHora.setBounds(10, 60, 100, 30);
        add(lblPagaPorHora);

        txtPagaPorHora = new JTextField();
        txtPagaPorHora.setBounds(140, 60, 150, 30);
        add(txtPagaPorHora);

        lblImpuesto = new JLabel("Tasa de impuesto:");
        lblImpuesto.setBounds(10, 100, 120, 30);
        add(lblImpuesto);

        txtImpuesto = new JTextField();
        txtImpuesto.setBounds(140, 100, 150, 30);
        add(txtImpuesto);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(60, 150, 100, 40);
        add(btnCalcular);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(180, 150, 100, 40);
        add(btnSalir);

        lblPagaPorHoraResultado = new JLabel();
        lblPagaPorHoraResultado.setBounds(30, 200, 300, 20);
        add(lblPagaPorHoraResultado);

        lblPagaBrutaResultado = new JLabel();
        lblPagaBrutaResultado.setBounds(30, 220, 300, 20);
        add(lblPagaBrutaResultado);

        lblImpuestoResultado = new JLabel();
        lblImpuestoResultado.setBounds(30, 240, 300, 20);
        add(lblImpuestoResultado);

        lblPagaNetaResultado = new JLabel();
        lblPagaNetaResultado.setBounds(30, 260, 300, 20);
        add(lblPagaNetaResultado);

        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);
    }

    private double calcularPagaBruta(double horasTrabajadas, double pagaPorHora) {
        return horasTrabajadas * pagaPorHora;
    }

    private double calcularImpuesto(double pagaBruta, double tasa) {
        return pagaBruta * tasa;
    }

    private double calcularPagaNeta(double pagaBruta, double impuesto) {
        return pagaBruta - impuesto;
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSalir) {
            JOptionPane.showMessageDialog(this, "Gracias por utilizar este programa", "Salir", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else if (e.getSource() == btnCalcular) {
            try {
                double horasTrabajadas = Double.parseDouble(txtHorasWorked.getText());
                double pagaPorHora = Double.parseDouble(txtPagaPorHora.getText());
                double tasaImpuesto = Double.parseDouble(txtImpuesto.getText());

                double pagaBruta = calcularPagaBruta(horasTrabajadas, pagaPorHora);
                double impuesto = calcularImpuesto(pagaBruta, tasaImpuesto);
                double pagaNeta = calcularPagaNeta(pagaBruta, impuesto);

                lblPagaPorHoraResultado.setText(String.format("Paga por Hora: %.2f", pagaPorHora)); 
                lblPagaBrutaResultado.setText(String.format("Paga Bruta: %.2f", pagaBruta)); 
                lblImpuestoResultado.setText(String.format("Impuesto: %.2f", impuesto)); 
                lblPagaNetaResultado.setText(String.format("Paga Neta: %.2f", pagaNeta));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, ingresa valores numéricos ", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        p143_PagaTrabajador app = new p143_PagaTrabajador();
        app.setBounds(0, 0, 350, 350);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
