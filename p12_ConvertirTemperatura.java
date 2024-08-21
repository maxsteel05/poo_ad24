// p12_ConvertirTemperatura - Se desea convertir una temperatura de grados fahrenheit a grados celsius, usando la siguiente formula:

import java.util.Scanner;

public class p12_ConvertirTemperatura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double TemperaturaCelcius,TemperaturaFahrenheit;

    System.out.println("Ingresa el valor de la temperatura en grados Fahrenheit: ");
    TemperaturaFahrenheit = sc.nextDouble();

    TemperaturaCelcius = (TemperaturaFahrenheit - 32) * (5.0/9.0);

    System.out.println("La temperatura en grados Celcius es: "+TemperaturaCelcius);
    }
    
}
