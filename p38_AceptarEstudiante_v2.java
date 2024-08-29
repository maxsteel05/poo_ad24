// p38_AceptarEstudiante_v2

import java.util.Scanner;

public class p38_AceptarEstudiante_v2 {
    public static void main(String[] args) {

        String Nombre;
        char Sexo;
        int Edad;
        double Cal1, Cal2, Cal3, Promedio;

        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Universidad Kitty Kat SA\n ");
        System.out.print("Por favor, ingresa tu nombre: ");
        Nombre = obj.nextLine();

        System.out.print("Por favor, ingresa tu sexo:\n[H]ombre\n[M]ujer\n ");
        Sexo = Character.toUpperCase( obj.next().charAt(0) );

        switch (Sexo) {
            case 'H': 
            System.out.print("Lo sentimos, la Universidad Kitty Kat SA solo admite mujeres "); 
            break;
            case 'M': 
            System.out.print("Por favor ingresa tu edad: "); 
            Edad = obj.nextInt();
            if ( 21 > Edad ) { System.out.println("Lo sentimos, La Universidad solo acepta mujeres mayores de 21 años ");}
            else if( 21 <= Edad ) 
                System.out.println("Ingresa la calificacion 1 ");
                Cal1 = obj.nextFloat();
                System.out.println("Ingresa la calificacion 2 ");
                Cal2 = obj.nextFloat();
                System.out.println("Dame la calificacion 3 ");
                Cal3 = obj.nextFloat();
                Promedio = ((Cal1 + Cal2 + Cal3) /3);
                if ( 8 <= Promedio ) { System.out.println("Felicidades " + Nombre + ", te damos la bienvenida a Kitty Kat. Tu promedio fue: " + Promedio  );}
                else if ( 8 > Promedio ) {System.out.println("Lo sentimos, no cumples con los requisitos necesarios");      
                }
                break; }
            }
        }
