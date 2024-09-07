// p63_SumaTerminos

import java.util.Scanner;

public class p63_SumaTerminos1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); 
        double  Suma;
        int TerminosUsuario;

        Scanner obj = new Scanner(System.in);
        System.out.print("Cuántos términos? "); TerminosUsuario = obj.nextInt();
       
        Suma = 0;
       
        System.out.print("Salida = ");
        for (int i = 1; i <= TerminosUsuario; i++) {
            if (i == 1) {
                System.out.print("1");
            } else {
                System.out.print(" + 1/" + i);
            }
            Suma += 1f / i;
        }
        obj.close();

        System.out.println();
        System.out.printf("Suma =  %.10f\n", Suma);
    } 
}
