import java.util.Scanner;

public class p128_ExcepcionRaiz {
    public static void main(String[] args) {
        Scanner Max = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        
        try {
            System.out.print("Por favor, introduce un número: ");
            float Numero = Max.nextFloat();
    
            
            if (Numero < 0 ) {
                System.out.println("Lo siento, no puedo sacar raíz de eso ... ");
            } else {
                double Raiz = Math.sqrt(Numero);
                System.out.println("La raíz cuadrada de " + Numero + " es: " + Raiz);
            }
        } catch (Exception e) {
            System.out.println("Por favor, ingresa un valor numérico ... ");
        } finally {
            Max.close();
        }
    }
} 
