package p136_Archivos5;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int op;
        Scanner Sebas = new Scanner(System.in);
        String archivo = "datos.dat";
        ArrayList <Persona> datos = new ArrayList<>();

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.print("\033[H\033[2J");
            System.out.println("--------------- Procesamiento de datos ---------------");
            System.out.println("Captura de datos ............................... [ 1 ]");
            System.out.println("Grabar datos en archivo ........................ [ 2 ]");
            System.out.println("Leer datos en archivo .......................... [ 3 ]");
            System.out.println("Mostrar datos .................................. [ 4 ]");
            System.out.println("S A L I R ...................................... [ 5 ]");
            op = Sebas.nextInt();
            switch (op) {
                case 1:
                    if (datos.size() == 0) System.out.println("\nCapturando datos por primera vez\n");
                    else System.out.println("\nLos datos capturados se agregarán al final de los existentes ");
                    Procesa.capturarDatos(datos);
                    break;
                case 2: 
                    try {
                        if (datos.size() != 0) {
                            Procesa.grabarDatos(archivo, datos);
                            System.out.println("\nDatos grabados correctamente ... ");
                        } else System.out.println("\nNo hay datos para grabar ... ");
                    } catch (Exception e) {
                        System.out.println("\nError al grabar los datos en el archivo ... ");
                    } break;
                    
                case 3:
                    try {
                        if (datos.size() !=0 ) System.out.println("\nLos datos que se leen, sobre escriben a los actuales ");
                        datos = Procesa.leerDatos(archivo);
                        System.out.println("\nDatos cargados correctamente ... ");
                    } catch (Exception e) {
                        System.out.println("\nError al cargar los datos del archivo ... ");
                    } break;

                case 4:
                    if(datos.size() == 0)
                        System.out.println("\nNo hay datos para mostrar");
                    else Procesa.mostrarDatos(datos);
                    break;
                default:
                    break;
            }
            System.out.println("\n<< Presione cualquier tecla para continuar >>"); Sebas.nextLine();Sebas.nextLine();
        } while (op != 5);
    }
}
