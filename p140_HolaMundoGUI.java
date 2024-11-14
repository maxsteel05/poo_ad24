import javax.swing.*;
import java.awt.*;

public class p140_HolaMundoGUI extends JFrame {
    
    private JLabel lblSaludo;

    public p140_HolaMundoGUI() {
        setLayout(null);
        lblSaludo = new JLabel("Hola Mundo");
        lblSaludo.setFont(new Font("Times New Roman", Font.BOLD+Font.ITALIC, 60));
        lblSaludo.setBounds(180, 110, 400, 40);
        add(lblSaludo);
        setTitle("Mi primer programa de interfaz gráfica en Java");
    }

    public static void main(String[] args) {
        p140_HolaMundoGUI app = new p140_HolaMundoGUI();

        app.setBounds(0, 0, 700, 300);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
