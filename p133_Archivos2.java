import java.io.*;

public class p133_Archivos2 {
    public static void main(String[] args) {
        String[] ciuddades = {"Zacatecas", "Fresnillo", "Cd Guzman", "Rio Grandre", "Guadalajara", "Novolato", "Zacatlán", "Nieves", "Tepetongo", "Momax", "Huejucar"};
        File arch = new File("ciudades.txt");

        System.out.print("\033[H\033[2J");

        if (! arch.exists()) {
            System.out.println("No existe, por lo tanto lo vamos a crear ... ");
            try {
                BufferedWriter fciudades = new BufferedWriter(new FileWriter(arch));
                for (String ciudad : ciuddades) {
                    fciudades.write(ciudad + "\n");
                }
                fciudades.close();
                System.out.println("Archivo creado con éxito ... ");
            } catch (Exception e) {
                System.out.println("Hubo error al manipular el archivo " + e.getMessage());
            }
        } else
            System.out.println("El archivo ya existe ... ");
    }
}
