// p49_ParesDescendente

import java.util.Scanner;

public class p49_ParesDescendente {
    public static void main(String[] args) {
        int c, n, s, calculador;
        double promedio;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();

            calculador = n = s = 0;
            System.out.println("Imprime pares de forma descendente desde 100 hasta n\n ");
            System.out.print("Hasta donde deseas los pares ? ");
            n = obj.nextInt();

            c = 100;
            System.out.printf("Números pares entre 100 y %d: \n", n);
            while ( c >= n ) {
                System.out.printf("\n%d " , c);
                s += c;
                c -= 2;
                calculador++;
            }
            promedio = s / calculador;
            System.out.printf("\n\nLa suma es: %d, el promedio es: %.2f\n", s, promedio);

            System.out.println("deseas continuar (S / N) ");
            resp = Character.toUpperCase (obj.next().charAt(0) );

        } while ( resp != 'N' );
        System.out.println("\nProceso terminado ");
    }
}
