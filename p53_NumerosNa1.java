// p53_NumerosNa1

import java.util.Scanner;

public class p53_NumerosNa1 {
    public static void main(String[] args) {

        int j, n, p;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Imprime los números de n a 1 usando for:\n");
        System.out.println("Desde dónde deseas descender ? "); n = obj.nextInt();
        System.out.println("En decrementos de            ? "); p = obj.nextInt();

        for (j=n; j >= 1; j-=p)
         System.out.print(j + " ");

        System.out.println("\nEl proceso ha terminado ... ");
        obj.close();
    }
}
