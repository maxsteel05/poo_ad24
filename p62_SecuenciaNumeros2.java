// p62_SecuenciaNumeros2

import java.util.Scanner;

public class p62_SecuenciaNumeros2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Cuántos rengolones ? "); int r = obj.nextInt();
        System.out.println();

        for (int i=1; i <= r; i++) {

            for (int j=1; j <= i; j++)
                System.out.print( j );
            
            System.out.println();
        }
        obj.close();
    }
}
