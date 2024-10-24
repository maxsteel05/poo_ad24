package p120_Vehiculo;

public class App {
    public static void main(String[] args) {
        Sedan miSedan = new Sedan("Vochito", "Maria Diaz", 4);
        Suv miSuv = new Suv("La mamalona ", "Carlos Castaneda ", 6);

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println(miSedan);
        miSedan.sistemElectrico();
        miSedan.combustionInterna();
        miSedan.carroceriaTres();
        miSedan.chasisMonocasco();
        miSedan.repostar();
        miSedan.arrancar();
        miSedan.frenar();
        System.out.println("");
        
        System.out.println(miSuv);
        miSuv.sistemElectrico();
        miSuv.combustionInterna();
        miSuv.traccion4x4();
        miSuv.chasisIndependiente();
        miSuv.repostar();
        miSuv.arrancar();
        miSuv.frenar();
    }
}
