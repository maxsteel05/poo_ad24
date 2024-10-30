package programas_parte1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class p123_Excepcion3 {
    public static void main(String[] args) {
        
        Scanner Sebas = new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();

        
        try {
            System.out.print("Valor del numerador ");   int a = Sebas.nextInt();
            System.out.print("Valor del denominador "); int b = Sebas.nextInt();
            int c = a / b;
            System.out.println("El resultado de la divisón es: " + c);
        } catch (InputMismatchException e) {
            System.out.println("Tanto el numerador como el denominador deben ser números ");
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0 ");
        } finally {
            System.out.println("\nHaiga sido como haiga sido ya nos vamos a desayunar ");
        }
        
    }
}
