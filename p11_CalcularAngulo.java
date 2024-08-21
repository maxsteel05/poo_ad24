// p11_CalcularAngulo - Se desea calcular el 3er ángulo de un triángulo dados los dos primeros ángulos del mismo, usando la siguiente formula

import java.util.Scanner;

public class p11_CalcularAngulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double angulo1, angulo2, angulo3;

    System.out.println("Ingresa el valor del angulo1: ");
    angulo1 = sc.nextDouble();

    System.out.println("Ingresa el valor del angulo2: ");
    angulo2 = sc.nextDouble();

    angulo3 = 180 - (angulo1 + angulo2);

    System.out.println("El valor del tercer angulo es: " + angulo3);
    }
}
