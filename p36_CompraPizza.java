// p36_CompraPizza

import java.util.Scanner;

public class p36_CompraPizza {
    public static void main(String[] args) {

        float TotalCompra, PrecioPizza, Descuento, TotalFinal;
        int Cantidad;
        char Tamaño;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        TotalCompra = PrecioPizza = Descuento = 0;
        System.out.println("Escoge el tamaño de tu Pizza:");
        System.out.println("\n[C]hica    - $5");
        System.out.println("[M]ediana  - $10");
        System.out.println("[G]rande   - $20");
        System.out.print("\nTu elección es: ");

        Tamaño = Character.toUpperCase(obj.next().charAt(0));

        switch (Tamaño) {
            case 'C':
                PrecioPizza = 5.0f;
                break;
            case 'M':
                PrecioPizza = 10.0f;
                break;
            case 'G':
                PrecioPizza = 20.0f;
                break;
            default:
                System.out.println("Opción inválida");
        }

        System.out.print("¿Cuál es la cantidad? ");
        Cantidad = obj.nextInt();

        TotalCompra = PrecioPizza * Cantidad;

        if (TotalCompra > 2000) {
            Descuento = TotalCompra * 0.15f;
        } else {
            Descuento = 0;
        }

        TotalFinal = TotalCompra - Descuento;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("\nTamaño de la pizza: " + Tamaño);
        System.out.println("Cantidad comprada: " + Cantidad);
        System.out.printf("Total compra: $%.2f\n", TotalCompra);
        System.out.printf("Descuento: $%.2f\n", Descuento);
        System.out.printf("Total de compra con descuento: $%.2f\n", TotalFinal);

    }
} 
