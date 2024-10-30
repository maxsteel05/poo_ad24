package programas_parte1;

import java.util.Scanner;

public class p125_Excepcion5 {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");System.out.flush();
        
        int a[] = {10, 20, 30, 40};

        System.out.println("Los elementos del arreglo son: ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        
        try {
            System.out.println("\nQue posición del arreglo quieres acceder ? ");
            int pos = new Scanner(System.in).nextInt();
            System.out.println("La posición " + pos + ", contiene en valor " + a[pos]);
        } catch (Exception e) {
            System.out.println("Te pasaste de lanza ... no puedo ir allá ");
        }
    }
    
}
