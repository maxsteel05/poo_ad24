import java.util.InputMismatchException;

import java.util.Scanner;

public class p129_ExcepcionDulces {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Scanner Max = new Scanner(System.in);
        
        try {
            System.out.print("Cuántos dulces hay en existencia ? "); int Dulces = Max.nextInt();
            System.out.print("Cuántos niños hay en el barrio   ? "); int Chamacos = Max.nextInt();
            int DulcePorChamaco = Dulces / Chamacos;
            System.out.println("A cada niño le toca " + DulcePorChamaco + " dulces ");
        } catch (InputMismatchException e) {
            System.out.println("Los niños y los dulces, deben ser cantidades numéricas ... ");
        } catch (ArithmeticException e) { 
            System.out.println("Sin niños no puedo repartir dulces ... ");
        } finally {
            System.out.println(" ");
            Max.close();
        }
    }
}
