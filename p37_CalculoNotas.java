// p37_CalculoNotas

import java.util.Scanner;

public class p37_CalculoNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float c1, c2, c3, c4, c5, Promedio;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Por favor ingresa la calificación 1 ");
        c1 = sc.nextFloat();
        System.out.println("Por favor ingresa la calificación 2 ");
        c2 = sc.nextFloat();
        System.out.println("Por favor ingresa la calificación 3 ");
        c3 = sc.nextFloat();
        System.out.println("Por favor ingresa la calificación 4 ");
        c4 = sc.nextFloat();
        System.out.println("Por favor ingresa la calificación 5 ");
        c5 = sc.nextFloat();

        Promedio = ((c1 + c2 + c3 + c4 + c5) / 5);

        if (( Promedio >0 ) && ( Promedio <=6 )) {
            System.out.println("\nLo siento, quedas reprobado ");
        } else if (( Promedio >6 ) && ( Promedio <=7 )) {
            System.out.println("\nPasas de panzaso ");
        } else if (( Promedio >7 ) && ( Promedio <=8 )) {
            System.out.println("\nMuy bien, puedes mejorar ");
        } else if (( Promedio >8 ) && ( Promedio <=9 )) {
                System.out.println("\nExcelente, sigue así ");
        } else if (( Promedio >9 ) && ( Promedio <=10 )) {
                System.out.println("\nPerfecto, tu esfuerzo valió la pena ");
        }
    }
}
