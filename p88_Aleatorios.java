// p88_Aleatorios - 

import java.util.Random;

public class p88_Aleatorios {
    public static void main(String[] args) {
        Random Sebas = new Random();

        int a1 = Sebas.nextInt(); // Genera un número aleatorio en el rango de ls números enteros 
        int a2 = Sebas.nextInt(30)+1; // 1...30
        int min = 10;
        int max = 30;
        int a3 = Sebas.nextInt(max - min + 1) + min; // 10...30

        System.out.print("\033[H\033[2J");
        System.out.println("Número entero aleatorio positivo: " + Math.abs(a1));
        System.out.println("Número entero aleatorio 1 ... 30: " + Math.abs(a2));
        System.out.println("Número entero aleatorio 10 ... 30: " + Math.abs(a3));
    }
}
