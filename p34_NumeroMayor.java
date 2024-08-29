// p34_NumeroMayor

import java.util.Scanner;

public class p34_NumeroMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print("\033[H\033[2J");  

        System.out.println("Ingresa el primer valor ");
        n1 = sc.nextInt();
        System.out.println("Ingresa el segundo valor ");
        n2 = sc.nextInt();
        System.out.println("Ingresa el tercer valor ");
        n3 = sc.nextInt();

        if (( n1 >= n2 ) && ( n1 >= n3 )) {
            System.out.println("El valor mayor es " + n1);
        } else if (( n2 >= n1 ) && ( n2 >= n3 )) {
            System.out.println("El valor mayor es " + n2);
        } else if (( n3 >= n1 ) && ( n3 >= n2 )) {
            System.out.println("El valor mayor es " + n3);
        }
    }
}
