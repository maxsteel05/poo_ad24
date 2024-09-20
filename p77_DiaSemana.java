// p77_DiaSemana - Devolver el día de la semana según el número 

import java.util.Scanner;

public class p77_DiaSemana {

    public static String DiaDeLaSemana(int Día) {
        if (Día < 1 || Día > 7) {
            return "\nIngresa un día entre 1 y 7 ";
        }

        switch (Día) {
            case 1: return      ("\nLunes ");
            case 2: return      ("\nMartes ");
            case 3: return      ("\nMiércoles ");
            case 4: return      ("\nJueves ");
            case 5: return      ("\nViernes ");
            case 6: return      ("\nSábado ");
            case 7: return      ("\nDomingo ");
            default: return ""; 
        }
    }

    public static void main(String[] args) {
        Scanner Max = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        
        System.out.println("Por favor ingresa un número entre 1 y 7");
        int Día = Max.nextInt();

        String DiaSegunNumero = DiaDeLaSemana(Día);
        System.out.println(DiaSegunNumero);
        
        Max.close();
    }
}
