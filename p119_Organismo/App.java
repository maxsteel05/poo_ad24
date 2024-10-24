package p119_Organismo;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();

        Perro miPerro = new Perro("Lassie");
        System.out.println("Mi perro " + miPerro.getNombre() + ", en acción: ");
        miPerro.respiración();
        miPerro.movimiento();
        miPerro.crecimiento();
        miPerro.multiCelular();
        miPerro.sangreCaliente();
        miPerro.correr();
        miPerro.cuatroPatas();
        System.out.println();

        Perico miPerico = new Perico("Sparrow");
        System.out.println("Mi Perico " + miPerico.getNombre() + ", en acción: ");
        miPerico.respiración();
        miPerico.movimiento();
        miPerico.crecimiento();
        miPerico.multiCelular();
        miPerico.sangreCaliente();
        miPerico.volar();
        miPerico.dosPatas();
        System.out.println();
    }
}
