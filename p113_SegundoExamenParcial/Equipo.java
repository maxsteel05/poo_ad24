package p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private String nombreLiga;
    private ArrayList<Jugador> listaJugadores;

    public Equipo() {
        listaJugadores = new ArrayList<>();
    }

    public Equipo(String nombreEquipo, String nombreLiga) {
        this.nombreEquipo = nombreEquipo;
        this.nombreLiga = nombreLiga;
        listaJugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador nuevoJugador) {
        listaJugadores.add(nuevoJugador);
    }

    public double calcularTotalBono() {
        double sumaBono = 0;
        for (Jugador jugador : listaJugadores) {
            sumaBono += jugador.getBono();
        }
        return sumaBono;
    }

    public double calcularTotalEquipo() {
        double sumaTotal = 0;
        for (Jugador jugador : listaJugadores) {
            sumaTotal += jugador.getTotal();
        }
        return sumaTotal;
    }

    public int contarHombres() {
        int cantidadHombres = 0;
        for (Jugador jugador : listaJugadores) {
            if (jugador.toString().contains("Sexo=H")) {
                cantidadHombres++;
            }
        }
        return cantidadHombres;
    }

    public int contarMujeres() {
        int cantidadMujeres = 0;
        for (Jugador jugador : listaJugadores) {
            if (jugador.toString().contains("Sexo=M")) {
                cantidadMujeres++;
            }
        }
        return cantidadMujeres;
    }

    public void generarReporte() {
        System.out.println(">> Equipo [Nombre=" + nombreEquipo + ", Liga=" + nombreLiga + 
                           ", Total de Jugadores=" + listaJugadores.size() + 
                           ", Bono Total=" + calcularTotalBono() + 
                           ", Total General=" + calcularTotalEquipo() + 
                           ", Hombres=" + contarHombres() + 
                           ", Mujeres=" + contarMujeres() + "]");
        for (Jugador jugador : listaJugadores) {
            System.out.println("- " + jugador);
        }
    }

    @Override
    public String toString() {
        return "Equipo [Nombre=" + nombreEquipo + ", Liga=" + nombreLiga + "]";
    }
}
