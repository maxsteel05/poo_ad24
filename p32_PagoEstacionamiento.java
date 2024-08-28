//Administra el pago por estacionamiento de acuerdo a la Zona 

import java.util.Scanner;

public class p32_PagoEstacionamiento {
    public static void main(String[] args) {

        float pago, total, imp;
        char est;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        pago = total = imp = 0;
        System.out.print("Elije el tipo de estacionamiento que usaste");
        System.out.println("\nEstacionamiento [N]orte  - 3%  ");
        System.out.println("Estacionamiento [S]ur    - 5%  ");
        System.out.println("Estacionamiento [E]ste   - 10% ");
        System.out.println("Estacionamiento [O]este  - 20% ");
        System.out.print("Elije ? ");

        est = Character.toUpperCase(obj.next().charAt(0));

        switch (est) {
            case 'N':
                imp = 0.03f;
                break;
            case 'S':
                imp = 0.05f;
                break;
            case 'E':
                imp = 0.10f;
                break;
            case 'O':
                imp = 0.20f;
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
        System.out.println("Cuanto pagaste ? ");
        pago = obj.nextFloat();
        total = (pago * imp) + pago;

        System.out.printf("Pagaste %.2f y un impuesto de %.2f en el total pagaste %.2f", pago, imp, total);
    }
}
