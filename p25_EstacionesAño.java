// Muestra la estación del año que corresponde al número introducido

import java.util.Scanner;

public class p25_EstacionesAño {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Muestra la estación del año en base al número:\n");
        System.out.print("Dame un número (1 ... 4) ? ");
        int n = new Scanner(System.in).nextInt();

        if ( n == 1 ) System.out.print("Primavera");
        if ( n == 2 ) System.out.print("Verano");
        if ( n == 3 ) System.out.print("Otoño");
        if ( n == 4 ) System.out.print("Invierno");
        System.out.println("\nProceso terminado ...");
    }
}
