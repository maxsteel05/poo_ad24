// Calcular el promedio de tres números usando una función 

import java.util.Scanner;

public class p66_PromedioNumeros {

    public static float Promedio(float num1, float num2, float num3) {
        float suma, promedio;
        suma = num1 + num2 + num3;
        promedio = suma / 3;
        return promedio;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Scanner Sebas = new Scanner(System.in);
        System.out.println("Dados 3 números flotantes obtener su promedio ");

        System.out.println("Dame numero 1 ? ");float num1 = Sebas.nextFloat();
        System.out.println("Dame numero 2 ? ");float num2 = Sebas.nextFloat();
        System.out.println("Dame numero 3 ? ");float num3 = Sebas.nextFloat();

        float promedio = Promedio(num1, num2, num3);

        //float prom = Promedio(9.5f, 9.0f, 7.2f);
        System.out.println("El promedio es " + promedio );

        //SYstem.out.println("El promedio es " + Promedio(10, 10, 10));
        Sebas.close();
    }
}
