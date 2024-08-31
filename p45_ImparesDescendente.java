import java.util.Scanner;

public class p45_ImparesDescendente {
    public static void main(String[] args) {
        int c, n, s;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();

            n = s = 0;
            System.out.println("Imprime impares de forma descendente de n hasta 1\n ");
            System.out.print("Desde donde deaseas los pares ? ");
            n = obj.nextInt();

            c = ( n%2 == 0 ? ++n : n );
            c = n;
            while ( c >= 1 ) {
                System.out.printf("%d " , c);
                s += c;
                c -= 2;
            }
            System.out.printf("\n\nLa suma de los impares desde %d es %d" , n, s);

            System.out.println(", deseas continuar (S / N) ");
            resp = Character.toUpperCase (obj.next().charAt(0) );

        } while ( resp != 'N' );
        System.out.println("\nProceso terminado ");
    }
}
