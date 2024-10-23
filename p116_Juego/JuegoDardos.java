package p116_Juego;
import java.util.Scanner;

public class JuegoDados implements Juego {
    private int Dado1, Dado2;
    private String Jugador1, jugador2;
    private Scanner Sebas = new Scanner(System.in);
    @Override
    public void Iniciar() {
        System.out.println("jugador1 "); Jugador1 = Sebas.nextLine();
        System.out.println("jugador2 "); jugador2 = Sebas.nextLine();
    }
    
    @Override
    public void jugar() {
        Dado1 = 1 + (int)(Math.random()*6);
        Dado2 = 1 + (int)(Math.random()*6);
        System.out.println(Jugador1 + " le salio el valor de " + Dado1);
        System.out.println(jugador2 + " le salio el valor de " + Dado2);
        
    }
    @Override
    public void Finalizar() {
        if (Dado1 > Dado2) 
            System.out.println("Gano " + Jugador1 + " con un valor de " + Dado1);
        else if (Dado2 > Dado1)
            System.out.println("Gano " + jugador2 + " con un valor de " + Dado2);
        else
            System.out.println("Los jugadores empataron con un valor de " + Dado2);
    }
}
