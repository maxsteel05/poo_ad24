

import java.util.Scanner;

public class p71_MayorTresNumeros {

    public static void Tabla(int tabla, int limite) {
        for(int i = 1; i<=limite; i++) {
            System.out.printf("%d x %d = %d \n", tabla, i, tabla * i);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner Max = new Scanner(System.in);

        System.out.println("Que tabla quieres ? "); int tabla = Max.nextInt();
        System.out.println("Hasta dónde       ? "); int limite = Max.nextInt();

        Tabla(tabla, limite);
        Max.close();
    }
}
