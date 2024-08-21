//p14_CalculoTiempo - Dada una cantidad en horas, calcular su equivalente en días, minutos y segundos, considerando que>

import java.util.Scanner;

public class p14_CalculoTiempo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double Dias,Horas,Minutos,Segundos;

        System.out.println("Ingresa la cantidad en horas: ");
        Horas = sc.nextInt();
        
        Dias = Horas / 24;
        Minutos = Horas * 60;
        Segundos = Horas * 3600;

    System.out.println("Las horas ingresadas equivalen a: " + Dias + " dias, " + Minutos + " minutos y "+ Segundos + " segundos");
    }
}
