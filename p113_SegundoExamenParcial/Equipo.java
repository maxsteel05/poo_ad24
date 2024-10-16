package p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String nombreEquipo;
    private String nombreLiga;
    private ArrayList<Jugador> listaJugadores;

    public Equipo() {
        this.listaJugadores = new ArrayList<>();
    }

    public Equipo(String nombreEquipo, String nombreLiga) {
        this.nombreEquipo = nombreEquipo;
        this.nombreLiga = nombreLiga;
        this.listaJugadores = new ArrayList<>();
    }

    public void añadirJugador(Jugador nuevoJugador) {
        this.listaJugadores.add(nuevoJugador);
    }

    public double calcularBonoTotal() {
        double bonoTotal = 0.0;
        for (Jugador jugador : this.listaJugadores) {
            bonoTotal += jugador.getBono();
        }
        return bonoTotal;
    }

    public double calcularSueldoTotal() {
        double sueldoTotal = 0.0;
        for (Jugador jugador : this.listaJugadores) {
            sueldoTotal += jugador.getTotal();
        }
        return sueldoTotal;
    }

    public int contarJugadoresHombres() {
        int cantidadHombres = 0;
        for (Jugador jugador : this.listaJugadores) {
            if (jugador.toString().contains("Sexo=H")) {
                cantidadHombres++;
            }
        }
        return cantidadHombres;
    }

    public int contarJugadorasMujeres() {
        int cantidadMujeres = 0;
        for (Jugador jugador : this.listaJugadores) {
            if (jugador.toString().contains("Sexo=M")) {
                cantidadMujeres++;
            }
        }
        return cantidadMujeres;
    }

    public void generarInforme() {
        System.out.println("== Equipo: " + this.nombreEquipo + " | Liga: " + this.nombreLiga + " ==");
        System.out.println("Total Jugadores: " + this.listaJugadores.size());
        System.out.println("Total Bono: " + calcularBonoTotal());
        System.out.println("Total Sueldo (Bono + Salario): " + calcularSueldoTotal());
        System.out.println("Hombres: " + contarJugadoresHombres() + " | Mujeres: " + contarJugadorasMujeres());
        System.out.println("-----------------------------------");
        for (Jugador jugador : this.listaJugadores) {
            System.out.println(jugador);
        }
    }

    @Override
    public String toString() {
        return "Equipo: " + this.nombreEquipo + " | Liga: " + this.nombreLiga;
    }
}




