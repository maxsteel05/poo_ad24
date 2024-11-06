package p139_ArchivoEstudiante;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int op;
        Scanner Max = new Scanner(System.in);
        String archivo = "Estudiantes.txt";
        ArrayList<Estudiante> datos = new ArrayList<>();

        do {
            System.out.print("\033[H\033[2J");
            System.out.println("----------------- Procesamiento de datos -----------------");
            System.out.println("Captura de datos .................................... [ 1 ]");
            System.out.println("Grabar datos en archivo ............................. [ 2 ]");
            System.out.println("Leer datos en archivo ............................... [ 3 ]");
            System.out.println("Mostrar datos ....................................... [ 4 ]");
            System.out.println("Promedio de calificaciones .......................... [ 5 ]");
            System.out.println("Promedio de edades .................................. [ 6 ]");
            System.out.println("Cantidad de Hombres ................................. [ 7 ]");
            System.out.println("Cantidad de Mujeres ................................. [ 8 ]");
            System.out.println("S A L I R ........................................... [ 9 ]");
            op = Max.nextInt();

            try {
                switch (op) {
                    case 1:
                        Procesa.capturarDatos(datos); break;
                    case 2:
                        if (!datos.isEmpty()) {
                            Procesa.grabarDatos(archivo, datos);
                            System.out.println("Datos grabados correctamente ");
                        } else {
                            System.out.println("No hay datos para grabar ... ");
                        }
                        break;
                    case 3:
                        datos = Procesa.leerDatos(archivo);
                        System.out.println("Datos leídos correctamente ");
                        break;
                    case 4:
                        Procesa.mostrarDatos(datos);
                        break;
                    case 5:
                        System.out.println("Promedio de calificaciones: " + Procesa.calcularPromedioCalificaciones(datos));
                        break;
                    case 6:
                        System.out.println("Promedio de edades: " + Procesa.calcularPromedioEdades(datos));
                        break;
                    case 7:
                        System.out.println("Cantidad de hombres: " + Procesa.contarHombres(datos));
                        break;
                    case 8:
                        System.out.println("Cantidad de mujeres: " + Procesa.contarMujeres(datos));
                        break;
                    default:
                        break;
                }
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error al procesar el archivo: " + e.getMessage());
            }

            if (op != 9) {
                System.out.println("\n<< Presiona Enter para continuar >>");
                Max.nextLine(); Sebas.nextLine(); 
            }
        } while (op != 9);
        Max.close();
    }
}
