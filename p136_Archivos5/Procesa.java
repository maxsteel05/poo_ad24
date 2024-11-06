package p136_Archivos5;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Procesa {
    public static void capturarDatos(ArrayList <Persona> datos) {
        Scanner Sebas = new Scanner(System.in);
        System.out.println("Introduce los datos de una Persona (nombre vacío para terminar )");
        while (true) {
            Persona persona = new Persona();
            System.out.print("Dato de la persona > ");
            System.out.print("\nNombre: "); persona.setNombre( Sebas.nextLine() );
            if (persona.getNombre().isEmpty() ) break;
            System.out.print("Edad: "); persona.setEdad( Sebas.nextInt() );
            System.out.print("Peso: "); persona.setPeso( Sebas.nextFloat() ); Sebas.nextLine();
            System.out.print("Correo: "); persona.setCorreo( Sebas.nextLine() );
            datos.add(persona);
        }
    }
    public static void  mostrarDatos(ArrayList <Persona> datos ) {
        System.out.println("Los datos hasta el momento son: ");
        for (Persona persona : datos) {
            System.out.println(persona);
        }
    }
    public static void grabarDatos(String archivo, ArrayList<Persona> datos) throws IOException {
        ObjectOutputStream fdatos = new ObjectOutputStream(new FileOutputStream(archivo));
        fdatos.writeObject(datos);
        fdatos.close();
    }
    public static ArrayList<Persona> leerDatos (String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Persona> datos = new ArrayList<>();
        ObjectInputStream fdatos = new ObjectInputStream (new FileInputStream(archivo));
        datos = (ArrayList <Persona>) fdatos.readObject();
        fdatos.close();
        return datos;
    }
}
