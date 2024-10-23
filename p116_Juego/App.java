package p116_Juego;

public class App {
    public static void main(String[] args) {
        JuegoDados miDados = new JuegoDados();

        System.out.print("\033[H\033[2J"); System.out.flush();

        miDados.Iniciar();
        miDados.jugar();
        miDados.Finalizar();

        JuegoAdivina mJuegodivina = new JuegoAdivina();
        mJuegodivina.Iniciar();
        mJuegodivina.jugar();
        mJuegodivina.Finalizar();
    }
}
