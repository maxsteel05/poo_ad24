// p39_Numeros1a100

import java.util.Scanner;

public class p39_Numeros1a100 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        
        System.out.println("Impriminedo los números de 0 a N en incrementos de i ");
        System.out.print("Hasta dónde ? "); int n = new Scanner(System.in).nextInt();
        System.out.print("En incrementos de ? "); int i = new Scanner(System.in).nextInt();

        int c = 0;

        while (c <= n ) {
            System.out.printf("Cheve %d\n ",c);
            c = c + i;
        }

        System.out.println("\nEl ciclo ha terminado ");
        System.out.println(c);
    }
}
