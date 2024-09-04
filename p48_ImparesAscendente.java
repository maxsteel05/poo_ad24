// p48_ImparesAscendente

import java.util.Scanner;

public class p48_ImparesAscendente {
    public static void main(String[] args) {
        int c, n, s, calculador;
        double promedio;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();

            calculador = n = s = 0;
            System.out.println("Imprime impares de forma ascendente desde 1 hasta n\n ");
            System.out.print("Hasta donde deseas los impares ? ");
            n = obj.nextInt();

            c = 1;
            System.out.printf("Números impares entre 1 y %d: \n", n);
            while ( n >= c ) {
                System.out.printf("%d " , c);
                s += c;
                c += 2;
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
