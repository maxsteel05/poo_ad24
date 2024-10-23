package p115_Telefono;

public class App {
    public static void main(String[] args) {
        Telefono miTelefono = new Telefono();

        System.out.print("\033[H\033[2J"); System.out.flush();

        miTelefono.ObtenerCoordenadas();
        miTelefono.IniciarRadio();
        miTelefono.detenerRadio();

    }
}
