// p78_MedidasLongitud - Convierte pulgadas a centimetros y metros a pies

import java.util.Scanner;

public class p78_MedidasLongitud {

    public static Float PulgadasACentimetros(Float Pulgadas) {
        if (Pulgadas < 0) {
            System.out.println("\nPor favor ingresa un valor positivo ");
            return null;
        }
        return Pulgadas * 2.54f;  
    }

    public static Float MetrosAPies(Float Metros) {
        if (Metros < 0) {
            System.out.println("\nPor favor ingresa un valor positivo ");
            return null;
        }
        return Metros * 3.281f;  
    }

    public static void main(String[] args) {
        Scanner Max = new Scanner(System.in);
        System.out.print("\033[H\033[2J");  

        System.out.println("Convierte pulgadas a centimetros y metros a pies ");
        System.out.println("Pulgadas a centímetros ... [ 1 ]");
        System.out.println("Metros a pies          ... [ 2 ]");
        System.out.println("Salir .................... [ 3 ]");
        System.out.print("Elije ? "); int op = Max.nextInt();

        switch (op) {
            case 1: 
                System.out.print("\nIngresa la cantidad de pulgadas: ");
                Float Pulgadas = Max.nextFloat();
                Float ResultadoCentimetros = PulgadasACentimetros(Pulgadas);
                if (ResultadoCentimetros != null) {
                    System.out.println("\nLa conversión a centímetros es: " + ResultadoCentimetros);
                }
                break;
            case 2: 
                System.out.print("\nIngresa la cantidad de Metros: ");
                Float Metros = Max.nextFloat();
                Float ResultadoPies = MetrosAPies(Metros);
                if (ResultadoPies != null) {
                    System.out.println("\nLa conversión a pies es: " + ResultadoPies);
                }
                break;
            case 3:
                System.out.println("\nHaz decidido salir del sistema ...\n");
                break;
            default:
                System.out.println("\nOpción inváida ");
                break;
        }
        Max.close();
    }
}
