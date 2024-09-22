// p85_NombresEdades

import java.util.Scanner;
public class p85_NombresEdades {
    public static void main(String[] args) {
        int n=0, s=0, p=0;
        Scanner Sebas = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.print("Cuantos elementos deseas procesar? "); n = Sebas.nextInt();

        String[] nombres = new String[n];
        int[] edades = new int[n];

        System.out.println("Dame los nombres y edades de los "+ n + " elementos");
        for (int i=0; i < n; i++){
            Sebas.nextLine();
            System.out.println("Nombre = ");nombres[i] = Sebas.nextLine();
            System.out.println("Edad = ");edades[i] = Sebas.nextInt();
        }
        System.out.println("Los nombres y edades capturados son: ");
        for(int i=0; i<n; i++){
        System.out.println(nombres[i]+ " - " + edades[i]);
        s = s + edades[i];
    }
    p=s/n;
    System.out.println("\nEl promedio de edades es "+p);
    Sebas.close();
    }
}
