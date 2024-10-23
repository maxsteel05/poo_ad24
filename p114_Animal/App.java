package p114_Animal;

public class App {
    public static void main(String[] args) {
        Gato miGato = new Gato();

        System.out.print("\033[H\033[2J"); System.out.flush();

        miGato.sonido();
        miGato.dormir();
    }
}
