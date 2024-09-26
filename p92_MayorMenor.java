// p92_MayorMenor - Solicita n numeros, muestra los numeros y muestra el mayor y menor 

import java.util.Scanner;

public class p92_MayorMenor {
    
    public static int Mayor(int[] numeros){
        int m = numeros[0];
        for(int i = 1; i < numeros.length;i++)
            if ( numeros[i] > m) m = numeros[i];
        return m;
    }
    public static int Menor(int[] numeros){
        int m = numeros[0];
        for(int i = 1; i < numeros.length;i++)
            if ( numeros[i] < m) m = numeros[i];
        return m;
    }
    public static void main(String[] args) {
        Scanner Sebas = new Scanner(System.in);
        int n = 1;

        System.out.print("\033[H\033[2J");
        
        System.out.print("Cuántos números?: "); n = Sebas.nextInt();
        int[] numeros = new int[n];

        System.out.print("Introduce los "+ n +" números ... ");
        for(int i=0; i < numeros.length; i++){
            System.out.print("\nNúmero #"+(i+1)+" = ");
            numeros[i] = Sebas.nextInt();
        }
        System.out.println("Todos los elementos: ");
        for(int i=0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("\n\nEl valor mayor es " + Mayor(numeros));
        System.out.println("\nEl valor menor es " + Menor(numeros));
        Sebas.close();
    }
}
