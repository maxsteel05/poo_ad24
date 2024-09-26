/ p93_ParesImpares - Suma pares e impares

import java.util.Random;

public class p93_ParesImpares {

    public static void Randommmm(int[] Numeros) {
        Random aleatorio = new Random();
        for (int i = 0; i<Numeros.length; i++) {
            Numeros[i] = aleatorio.nextInt(20) + 1;
        }
    }
    public static void mostrarNumeros(int[] Numeros) {
        for (int i = 0; i < Numeros.length; i++) {
            System.out.print(Numeros[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        int TamArreglo = 20;
        int[] Numeros = new int[TamArreglo];
        int SumaPares = 0, SumaImpares = 0;
        String Pares = "", Impares = "";

        Randommmm(Numeros);
        
        System.out.println("Este es el arreglo: ");
        mostrarNumeros(Numeros);

        for (int i = 0; i<Numeros.length; i++) {
            if (Numeros[i] % 2 == 0) {
                Pares += Numeros[i] + " ";
                SumaPares += Numeros[i];
            } else {
                Impares += Numeros[i] + " ";
                SumaImpares += Numeros[i];
            }
        }
        System.out.println("\nNúmeros pares: " + Pares);
        System.out.println("Suma de números pares: " + SumaPares);

        System.out.println("\nNúmeros impares: " + Impares);
        System.out.println("Suma de números impares: " + SumaImpares);
    }
}
