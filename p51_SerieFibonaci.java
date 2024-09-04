// p51_SerieFibonacci

import java.util.Scanner;

public class p51_SerieFibonaci {
    public static void main(String[] args) {
        int a, b, c, ValMax, i;
        char  resp;
        Scanner obj = new Scanner(System.in);

        do {

            System.out.print("\033[H\033[2J"); System.out.flush();

            System.out.print("Por favor, ingresa el valor máximo: ");
            ValMax = obj.nextInt();

            a = 0;
            b = 1;
            i = 0;
            System.out.println("\nLa sucesión de Fibonacci es: ");

            while ( i < ValMax) {
            i++;
                System.out.print( a + " " );
                c = a + b;
                a = b;
                b = c;
            }
            
            System.out.print("\n\n¿Deseas continuar (S / N)? ");
            resp = Character.toUpperCase(obj.next().charAt(0));

        } while (resp != 'N');

        System.out.println("\nProceso terminado ... ");
    }
}
