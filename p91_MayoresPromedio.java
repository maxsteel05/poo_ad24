// p91_MayoresPromedio - Solicita n calificaciones, se obtiene el promedio y se muestran las calificaciones 
// mayores al rpomedio 

import java.util.Scanner;

public class p91_MayoresPromedio {
    public static void main(String[] args) {
        Scanner Sebas = new Scanner(System.in);
        int n = 0;
        float Suma = 0, Promedio = 0;
        int MayoresPromedio = 0;
        StringBuilder mayores = new StringBuilder();

        System.out.print("\033[H\033[2J");

        System.out.println("Cuantas calificaciones? "); 
        n = Sebas.nextInt();
        float[] califs = new float[n];

        System.out.print("Introduce las " + n + " calificaciones ... ");
        for(int i = 0; i < califs.length; i++) {
            System.out.print("\nCalificación # " + (i + 1) + " = ");
            califs[i] = Sebas.nextFloat();
        }

        System.out.println("\nLas calificaciones capturadas son: ");
        for(float cal : califs) {
            System.out.println(cal + " ");
            Suma += cal;
        }
        Promedio = Suma / califs.length;

        for(float Cal : califs) {
            if(Cal > Promedio) {
                MayoresPromedio++;
                mayores.append(Cal).append(" ");
            }
        }

        System.out.println("\nLa suma es " + Suma);
        System.out.println("El promedio es " + Promedio);
        System.out.println("Los valores mayores que el promedio son: " + MayoresPromedio);
        System.out.println("Estos valores son: " + mayores.toString().trim());

        Sebas.close();
    }
}
