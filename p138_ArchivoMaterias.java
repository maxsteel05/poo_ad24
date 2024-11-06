import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class p138_ArchivoMaterias {

    public static void capturarmaterias(ArrayList<String> materias) {
        String materia = "";
        System.out.println("\nIntroduce un materia y presiona < Enter > materia vacía para terminar ");

        while (true) {
            materia = new Scanner(System.in).nextLine();
            if (materia.isEmpty()) break;
            materias.add(materia);
        }
        System.out.println();
    }

    public static void mostrarmaterias(ArrayList<String> materias) {
        System.out.println("\nLos materias hasta el momento son ...");
        for (String materia : materias) 
            System.out.println(materia);
    }

    public static void grabarmaterias(String archivo, ArrayList<String> materias) throws IOException {
        BufferedWriter fmaterias = new BufferedWriter(new FileWriter(new File(archivo)));
        for (String materia : materias) 
            fmaterias.write(materia + "\n");
        fmaterias.close();
    }

    public static ArrayList<String> leermaterias (String archivo) throws IOException {
        ArrayList<String> materias = new ArrayList<>();
        BufferedReader fmaterias = new BufferedReader(new FileReader(new File(archivo)));
        String materia;
        while((materia=fmaterias.readLine())!=null)
            materias.add(materia);
        return materias;
    }
    public static void main(String[] args) {
        int op;
        Scanner Sebas = new Scanner(System.in);
        ArrayList<String> materias = new ArrayList<>();
        String archivo = "Materias.txt";
        
        do {
            System.out.print("\033[H\033[2J");
            System.out.println("--------------- Procesamiento de materias ---------------");
            System.out.println("Captura de materias ............................... [ 1 ]");
            System.out.println("Grabar materias en archivo ........................ [ 2 ]");
            System.out.println("Leer materias en archivo .......................... [ 3 ]");
            System.out.println("Mostrar materias .................................. [ 4 ]");
            System.out.println("S A L I R ......................................... [ 5 ]");
            System.out.print("Seleccione una opción: "); op = Sebas.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("\nCaptura de materias ... ");
                    capturarmaterias(materias); break;
                case 2:
                    System.out.println("\nGrabando materias en archivo... "); 
                    try {
                        grabarmaterias(archivo, materias);
                    } catch (Exception e) {
                        System.out.println("Error al grabar el archivo ... ");
                    }
                    break;
                case 3:
                    System.out.println("\nLeyendo materias en archivo ... "); 
                    try {
                        materias = leermaterias(archivo);
                    } catch (Exception e) {
                        System.out.println("\nError leyendo el archivo ... ");
                    } break;
                case 4:
                    System.out.println("\nMostrando materias ... ");
                    mostrarmaterias(materias); break;
                case 5:
                    System.out.println("\nSaliendo del sistema ... "); break;
                default:
                    System.out.println("\nOpción inválida ...!!! ...!!! ...!!!"); break;
            }
            System.out.println("\n\n<< Presione cualquier tecla para continuar >>"); Sebas.nextLine();Sebas.nextLine();
        } while (op != 5);
        System.out.println("\nProceso terminado ... ");
    }
}   
