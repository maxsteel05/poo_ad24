//p68_SumaRango

import java.util.Scanner;

public class p68_SumaRango {

    public static int SumaRango(int ini, int fin) {
        int suma =0;
        for(int i = ini; i <= fin; i++) {
            suma = suma + i;
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner Sebas = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        int suma = 0, ini, fin;

        do {
            System.out.println("Dame el inicio ? "); ini = Sebas.nextInt();
            System.out.println("Dame el fin ? "); fin = Sebas.nextInt();
        } while ( ini > fin );

        suma = SumaRango(ini, fin);

        System.out.println("\nLa suma del rango es " + suma);
        Sebas.close();
    }
}
