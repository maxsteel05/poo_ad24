// p64_SumaTerminos2

import java.util.Scanner;

public class p64_SumaTerminos2 {

    public static void main(String[] args) {
        int TerminosUsuario, Suma, ValorTerminos;
        boolean repite = true;
        Scanner obj = new Scanner(System.in);

        while (repite) {

            Suma = 0;
            StringBuilder SerieTerminos = new StringBuilder();

            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.print("Cuántos términos? "); TerminosUsuario = obj.nextInt();
       
            for ( int i = 1; i <= TerminosUsuario; i++ ) {
                
                StringBuilder SecuenciaUnos = new StringBuilder();
                for ( int j = 0; j < i; j++ ) {
                    SecuenciaUnos.append("1");
                }

                ValorTerminos = Integer.parseInt(SecuenciaUnos.toString());
                Suma += ValorTerminos;

                if ( 1 < i ) {
                    SerieTerminos.append(" + ");
                }
                SerieTerminos.append(SecuenciaUnos.toString());
            }

            System.out.println(SerieTerminos.toString());
            System.out.println("suma " + Suma);

            System.out.print("Deseas continuar ( S / N ) ? ");
            String resp = obj.next().toUpperCase();
            repite = resp.equals("S");
        }
        System.out.println("\nProceso terminado ... ");
        obj.close();
    }
}
