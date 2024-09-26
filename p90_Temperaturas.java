// p90_Temperaturas - Muestra el primer y tercer valor y luego todos los valores, y aquellos 
// mayores a 10 se cambian a 0

public class p90_Temperaturas {
    public static void main(String[] args) {
            System.out.print("\033[H\033[2J");
        float [] temperaturas = {2.34f, 44.56f, 7.89f, 0.5f, 2.5f, 4.67f, 40.3f, 22.35f, 56.22f};

        System.out.println("\nPrimer elemento del arreglo: " + temperaturas[0] );
        System.out.println("\nTercer elemento del arreglo: " + temperaturas[2] );
        System.out.println("\nTodos los elementos: ");
        for(int i=0; i < temperaturas.length; i++) {
            System.out.print(temperaturas[i] + " ");
        }
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > 10) {
                temperaturas[i] = 0;
            }
        }
        System.out.println("\n\nValores mayores a 10 cambiados a 0: ");
        for (float temp : temperaturas) {
            System.out.print(temp + " ");
        }
    }
}
