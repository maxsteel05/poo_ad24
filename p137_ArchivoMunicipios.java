import java.io.*;

public class p137_ArchivoMunicipios {
    public static void main(String[] args) {
        String[] municipios = {"Zacatecas", "Fresnillo", "Jerez", "Teul de GO", "Miguel Auza", "Tlatenango", "Villanueva", "Apozol", "Cañitas de Felipe", "Santa María de lla Guerra"};
        File arch = new File("municipios .txt");

        System.out.print("\033[H\033[2J");

        if (! arch.exists()) {
            System.out.println("No existe, por lo tanto lo vamos a crear ... ");
            try {
                BufferedWriter fmunicipios = new BufferedWriter(new FileWriter(arch));
                for (String municipio : municipios) {
                    fmunicipios.write(municipio + "\n");
                }
                fmunicipios.close();
                System.out.println("Archivo creado con éxito ... ");
            } catch (Exception e) {
                System.out.println("Hubo error al manipular el archivo " + e.getMessage());
            }
        } else
            System.out.println("El archivo ya existe ... ");
    }
}
