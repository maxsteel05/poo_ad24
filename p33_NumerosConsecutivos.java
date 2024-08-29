// p33_Numeros Consecutivos 

import java.util.Scanner;

public class p33_NumerosConsecutivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print("\033[H\033[2J");

        System.out.println("Ingresa el primer valor");
        n1 = sc.nextInt();
        System.out.println("Ingresa el segundo valor");
        n2 = sc.nextInt();
        System.out.println("Ingresa el tercer valor");
        n3 = sc.nextInt();

        if (( n3 == n2 + 1 ) && ( n2 == n1 + 1 )) {
            System.out.println("Los números son consecutivos ");
        }
        else
            System.out.println("Los números no son consecutivos ");
    }
}
