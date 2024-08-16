// p02_AreaCirculo - calcular el área de un círculo

import java.util.Scanner;

public class p02_AreaCirculo {

    public static void main(String[] args) {
        double radio, area;
        Scanner lradio = new Scanner(System.in);

        System.out.println("\nCalculando el área de un círculo\n");
        System.out.print("Dame el radio del círculo: ");
        radio = lradio.nextDouble();  

        area = Math.PI * Math.pow(radio, 2); 

        System.out.println("\nEl círculo con radio de " + radio + " tiene un área de " + area);
    }
}

