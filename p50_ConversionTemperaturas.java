
// p50_ConversionTemperaturas

import java.util.Scanner;

public class p50_ConversionTemperaturas {
    public static void main(String[] args) {
        double ini, fin, c;
        double Fahrenheit;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {       

            System.out.print("\033[H\033[2J"); System.out.flush();
             System.out.println("Tabla de conversión de grados Centígrados a grados Fahrenheit");

            do {
                System.out.print("Temperatura inicial:   "); ini = obj.nextDouble();
                System.out.print("Temperatura final  :   "); fin = obj.nextDouble();

                if (fin < ini) {
                    System.out.println("La temperatura final debe ser mayor a la inicial ");
                }

            } while (fin < ini);


            System.out.println("---------------------------------------");
            System.out.println("    Centígrados \t    Fahrenheit ");
            System.out.println("---------------------------------------");

            c = ini;
            while (c <= fin) {
                Fahrenheit = (c * (9f / 5f))+ 32 ;
                System.out.printf("%10.2f \t\t %10.2f\n", c, Fahrenheit);
                c++;
            }

            System.out.println("---------------------------------------");
            System.out.print("¿Deseas continuar (S / N)? ");
            resp = Character.toUpperCase(obj.next().charAt(0));

        } while (resp != 'N');
        
        System.out.println("\nProceso terminado ... ");
    }
}
