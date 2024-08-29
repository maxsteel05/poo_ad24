// p35_ContinentesMundo

import java.util.Scanner;

public class p35_ContinentesMundo {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.println("Dado un número entre 1 y 6 que corresponde a un continente del mundo\n ");
        System.out.print("Dame el número ? ");

        int Num = new Scanner(System.in).nextInt();
        switch (Num) {
            case 1 : System.out.println("Asia "); break;
            case 2 : System.out.println("África "); break;
            case 3 : System.out.println("América del Norte "); break;
            case 4 : System.out.println("América del Sur "); break;
            case 5 : System.out.println("Antártida "); break;
            case 6 : System.out.println("Europa "); break;
            default : System.out.println("Por favor ingresa un número entre 1 y 6 "); break;
        }
    }
}
