package p108_Forma;

import java.util.ArrayList;
public class App {
    public static void main(String[] args) {
    ArrayList<Forma> formas = new ArrayList<>();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Circulo c1= new Circulo("Rojo", 10);
        Triangulo t1= new Triangulo("Azul", 10, 20);
        System.out.println();
        System.out.println("Círculo");
        System.out.println(c1);
        System.out.println();
        System.out.println("Triángulo");
        System.out.println(t1);
        formas.add(c1);
        formas.add(t1);
        formas.add(new Circulo("Café", 45.50));
        formas.add(new Triangulo("Café", 100, 300));
        System.out.println();
        System.out.println("Las formas dentro del arreglo:");
        for (Forma forma : formas) {
            System.out.println(forma);
        }
    }
}
