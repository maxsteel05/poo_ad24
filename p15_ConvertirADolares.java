// p15_ConvertirADolares - Dada una cantidad en pesos y la cotización del dólar, se desea obtener el equivalente en dólares.

import java.util.Scanner;

public class p15_ConvertirADolares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double Dolares,Pesos;

    System.out.println("Ingresa el valor en pesos: ");
    Pesos = sc.nextDouble();

    Dolares = (Pesos * 18.81);
    System.out.println("La conversion a dolares es: $" + Dolares);
    }
}
