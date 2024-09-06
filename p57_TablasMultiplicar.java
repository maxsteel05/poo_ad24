// p57_TablasMultiplicar

import java.util.Scanner;

public class p57_TablasMultiplicar {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        boolean repite = true;

        while (repite) {

            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.print("Hasta que tabla quieres ? "); int n = obj.nextInt();
            System.out.print("Hasta donde la quieres  ? "); int m = obj.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.println("Tabla del " + i);

                for(int j=1; j<=m; j++) 
                    System.out.println(i + " x " + j + " = " + i * j);

                System.out.println();
            }

            System.out.print("Deseas continuar ( S / N ) ? ");
            String resp = obj.next().toUpperCase();
            repite = resp.equals("S");
        }
        System.out.println("\nProceso terminado ... ");
        obj.close();
    }
}
