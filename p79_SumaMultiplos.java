// p79_SumaMultiplos - Sumar los multiplos de 3 o 4 en un rango dado

import java.util.Scanner;

public class p79_SumaMultiplos {

    public static int SumaMultiplos(int ini, int fin, int multiplo) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            if (i % multiplo == 0) {
                suma += i;
            }
        }
        return suma;
    }
    public static void main(String[] args) {
        Scanner Max = new Scanner(System.in);
        System.out.print("\033[H\033[2J");

        System.out.println("Suma de los múltiplos de 3 o 4 en un rango dado ");
        System.out.println("\nPor favor ingresa el inicio "); int ini = Max.nextInt();
        System.out.println("\nPor favor ingresa el fin "); int fin = Max.nextInt();

        if (ini >= fin) {
            System.out.println("Verifica que el inicio sea menor al fin");
        } else {
            System.out.println("Multiplos de 3 ... [ 1 ]");
            System.out.println("Multiplos de 4 ... [ 2 ]");
            System.out.println("Salir ............ [ 3 ]");
            System.out.print("Elije ? "); int op = Max.nextInt();

            switch (op) {
                case 1:
                    int SumaMultiplos3 = SumaMultiplos(ini, fin, 3);
                    System.out.println("La suma de los múltiplos de 3 entre " + ini + " y " + fin + " es: " + SumaMultiplos3);
                    break;
                case 2:
                    int SumaMultiplos4 = SumaMultiplos(ini, fin, 4);
                    System.out.println("La suma de los múltiplos de 4 entre " + ini + " y " + fin + " es: " + SumaMultiplos4);
                    break;
                case 3:
                    System.out.println("\nHaz decidido salir del sistema ...\n");
                    break;
                default:
                    System.out.println("\nOpción inváida ");
                    break;
            }
        }
        Max.close();
    }
}
