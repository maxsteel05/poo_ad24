package p139_ArchivoEstudiante;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Procesa {
    
    public static void capturarDatos(ArrayList<Estudiante> datos) {
        Scanner Sebas = new Scanner(System.in);
        System.out.println("Ingresa los datos del Estudiante (nombre vacío para terminar) ");
        while (true) {
            Estudiante estudiante = new Estudiante();
            System.out.print("Nombre: ");
            estudiante.setNombre(Sebas.nextLine());
            if (estudiante.getNombre().isEmpty()) break;
            System.out.print("Edad: ");
            estudiante.setEdad(Sebas.nextInt());
            System.out.print("Promedio: ");
            estudiante.setPromedio(Sebas.nextDouble()); Sebas.nextLine(); 
            System.out.print("Sexo [H/M]: ");
            estudiante.setSexo(Sebas.nextLine().charAt(0)); datos.add(estudiante);
        }
    }
    public static void mostrarDatos(ArrayList <Estudiante> datos) {
        System.out.println("Los datos de los estudiantes son: ");
        for (Estudiante estudiante : datos) {
            System.out.println(estudiante);
        }
    }
    public static void grabarDatos(String archivo, ArrayList<Estudiante> datos) throws IOException {
        ObjectOutputStream fdatos = new ObjectOutputStream(new FileOutputStream(archivo));
        fdatos.writeObject(datos);
        fdatos.close();
    }
    public static ArrayList <Estudiante> leerDatos(String archivo) throws IOException, ClassNotFoundException {
        ArrayList<Estudiante> datos = new ArrayList<>();
        ObjectInputStream fdatos = new ObjectInputStream(new FileInputStream(archivo));
        datos = (ArrayList<Estudiante>) fdatos.readObject();
        fdatos.close();
        return datos;
    }
    public static double calcularPromedioCalificaciones(ArrayList <Estudiante> datos) {
        double sumaCalificaciones = 0;
        for (Estudiante estudiante : datos) {
            sumaCalificaciones += estudiante.getPromedio();
        }
        return datos.size() > 0 ? sumaCalificaciones / datos.size() : 0;
    }
    public static double calcularPromedioEdades(ArrayList <Estudiante> datos) {
        int sumaEdades = 0;
        for (Estudiante estudiante : datos) {
            sumaEdades += estudiante.getEdad();
        }
        return datos.size() > 0 ? (double) sumaEdades / datos.size() : 0;
    }
    public static int contarHombres(ArrayList <Estudiante> datos) {
        int contadorHombres = 0;
        for (Estudiante estudiante : datos) {
            if (estudiante.getSexo() == 'H') {
                contadorHombres++;
            }
        }
        return contadorHombres;
    }
    public static int contarMujeres(ArrayList <Estudiante> datos) {
        int contadorMujeres = 0;
        for (Estudiante estudiante : datos) {
            if (estudiante.getSexo() == 'M') {
                contadorMujeres++;
            }
        }
        return contadorMujeres;
    }
}
