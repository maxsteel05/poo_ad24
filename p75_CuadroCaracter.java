
 // p75_CuadroCaracter - Dibuja un cuadro r x c del caracter deseado.
 

import java.util.Scanner;

public class p75_CuadroCaracter {

    public static void Cuadro (int r, int c, char car) {
        for (int i=1; i<=r; i++) {
            for (int j=1; j<=c; j++)
                System.out.print(car);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("De cuántos renglones lo quieres   ? "); int r = obj.nextInt();
        System.out.print("De cuantas columnas la quieres    ? "); int c = obj.nextInt();

        System.out.print("Qué caracter quieres              ? "); char car = obj.next().charAt(0);

        Cuadro(r, c, car);

        obj.close();
    }
}
