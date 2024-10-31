package p131_ExcepcionTemperatura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static double CalculadoraTemperatura(double Centigrados) throws TemperaturaExcesiva {
        if (Centigrados > 100) {
            throw new TemperaturaExcesiva("La temperatura es muy alta, no se puede convertir ");
        }
        return (Centigrados * 9/5) + 32;
    }
    public static void main(String[] args) {
        Scanner Max = new Scanner(System.in);

        System.out.print("\033[H\033[2J");

        try {
            System.out.print("Ingresa la temperatura en grados Centigrados: "); 
            double Centigrados = Max.nextDouble();
            System.out.println(Centigrados + " grados Centigrados, equivale a " + 
            CalculadoraTemperatura(Centigrados) + " grados Fahrenheit ");
        } catch (TemperaturaExcesiva e) {
            System.out.println("Error: " + e);
        } catch (InputMismatchException e) {
            System.out.println("Por favor, ingresa un valor numérico ... ");
        } finally {
            Max.close();
        }
    }
}
