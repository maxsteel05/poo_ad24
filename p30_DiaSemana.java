// Dado un numero entre 1 y 7 imprime el dia de la semana

import java.util.Scanner;

public class p30_DiaSemana {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Dado un número entre 1 y 7 imprime el dia de la semana\n ");
        System.out.print("Dame el día con número ? ");
        int dia = new Scanner(System.in).nextInt();
        switch (dia) {
            case 1 : System.out.println("Domingo .. domrir "); break;
            case 2 : System.out.println("Lunes .. clase"); break;
            case 3 : System.out.println("Martes .. clase"); break;
            case 4 : System.out.println("Miércoles .. clase"); break;
            case 5 : System.out.println("Jueves .. casi nos vamos"); break;
            case 6 : System.out.println("Viernes .. ya nos fuimos de hecho"); break;
            case 7 : System.out.println("Sábado");break;
            default : System.out.println("A ver, quieres irte temprano a desayunar ?!"); break;
        }
        System.out.println("\nGracias por utilizar este programa");
    }
}
